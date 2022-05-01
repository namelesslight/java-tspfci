package com.example.javatspfci.code.stencil.impl;

import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.entity.vo.FactoryMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.*;
import com.example.javatspfci.code.stencil.BaseStencil;
import com.example.javatspfci.code.util.FileUtil;
import com.example.javatspfci.code.util.JWTUtil;
import com.example.javatspfci.code.util.SecretUtil;
import com.example.javatspfci.code.util.UUIDUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 通用Service接口实现类
 */
@Service
public class BaseStencilImpl implements BaseStencil {

    @Resource
    private AllPasswordService allPasswordService;

    @Resource
    private DeliveryService deliveryService;

    @Resource
    private FactoryService factoryService;

    @Resource
    private StoreService storeService;

    @Resource
    private LogService logService;

    @Resource
    private UserRoleService userRoleService;

    @Resource
    private AdminService adminService;

    private final String PHONE_PATTERN = "^[1][3,5,7,8]\\d{9}$";

    /**
     * 用户注册
     * @param name 姓名
     * @param phone 电话号码
     * @param role  身份
     * @param password 密码
     * @param rwPassword 确认密码
     * @param  logStatus 操作状态
     * @param  path url路径
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result userRegister(String name, String phone, String role, String password, String rwPassword, String logStatus,String path) {
        Map<String,Object> data = new HashMap<>();
        //初始默认返回码
        Integer registerCode = 1;
        //判断手机号码是否符合格式
        Boolean phoneJudge = Pattern.matches(PHONE_PATTERN, phone);
        if (phoneJudge){
            data.put("phone","手机格式正确");
        } else {
            data.put("phone","手机格式不正确");
            registerCode = 0;
        }
        //判断密码是否大于六位小于20位
        Boolean passwordJudge = passwordLen(password);
        if (passwordJudge){
            data.put("password","密码符合要求");
        } else {
            data.put("password","请输入大于6位小于20位的密码");
            registerCode = 0;
        }
        //判断密码输入是否前后一致
        Boolean rwPasswordJudge = password.equals(rwPassword);
        if (rwPasswordJudge){
            data.put("rw_password","前后密码一致");
        } else {
            data.put("rw_password","前后密码不一致");
            registerCode = 0;
        }
        //判断权限是否是对应的前端权限输入
        Boolean roleJudge = role.equals("user") || role.equals("userAdmin") || role.equals("deliver");
        if (roleJudge){
            data.put("role","权限正确");
        } else {
            data.put("role","权限不正确");
            registerCode = 0;
        }
        if (registerCode == 1){
            String userId = UUIDUtil.getUUID();
            String secretPassword= SecretUtil.secretString(password);
            switch (role){
                case "user":
                    if (!storeService.queryCountByPhone(phone)) {
                        allPasswordService.addUser(userId, secretPassword);
                        storeService.addStore(userId, name, phone);
                    } else {
                        data.put("phone","手机号码已注册");
                        registerCode = 0;
                    }
                    break;
                case "userAdmin":
                    if (!factoryService.queryCountByPhone(phone)) {
                        allPasswordService.addUser(userId, secretPassword);
                        factoryService.addFactory(userId, name, phone);
                    } else {
                        data.put("phone","手机号码已注册");
                        registerCode = 0;
                    }
                    break;
                case "deliver":
                    if (!deliveryService.queryCountByPhone(phone)) {
                        allPasswordService.addUser(userId, secretPassword);
                        deliveryService.addDelivery(userId, name, phone);
                    } else {
                        data.put("phone","手机号码已注册");
                        registerCode = 0;
                    }
                    break;
            }
            if (registerCode == 1){
                userRoleService.addRole(userId, role);
                logService.addLog(userId,logStatus);
            }

        }
        Map<String,Object> message = new HashMap<>();
        message.put("register_code",registerCode);
        message.put("data",data);
        return new Result().result200(message,path);
    }

    /**
     * 用户登录
     * @param phone 电话号码
     * @param password 密码
     * @param  logStatus 操作状态
     * @param  path url路径
     * @return
     */
    @Override
    public Result userLogin(String phone, String password, String logStatus, String path) {
        return null;
    }

    /**
     * 管理员注册
     * @param adminName 管理员用户名
     * @param password 密码
     * @param rwPassword 确认密码
     * @param role 角色权限
     * @param logStatus 操作状态
     * @param path url路径
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result adminRegister(String adminName, String password, String rwPassword, String role, String logStatus, String path) throws IOException {
        Map<String,Object> data = new HashMap<>();
        Integer registerCode = 1;
        //判断用户名是否已用
        Boolean nameJudge = adminService.queryAdminCountByUsername(adminName);
        if (!nameJudge){
            data.put("username","用户名可用");
        } else {
            data.put("username","用户名已使用");
            registerCode = 0;
        }
        //判断密码是否大于6位小于20位
        Boolean passwordJudge = passwordLen(password);
        if (passwordJudge){
            data.put("password","密码符合要求");
        } else {
            data.put("password","请输入大于6位小于20位的密码");
            registerCode = 0;
        }
        //判断前后密码是否一致
        Boolean rwPasswordJudge = password.equals(rwPassword);
        if (rwPasswordJudge){
            data.put("rw_password","前后密码一致");
        } else {
            data.put("rw_password","前后密码不一致");
            registerCode = 0;
        }
        Boolean roleJudge = role.equals("superAdmin");
        //判断是否为管理员权限注册
        if (roleJudge){
            data.put("role","权限正确");
        } else {
            data.put("role","权限不正确");
            registerCode = 0;
        }
        if (registerCode == 1){
            String imagePath = "D:\\adminHead\\" + adminName;
            File fileDir = new File(imagePath);
            String adminId = UUIDUtil.getUUID();
            String secretPassword = SecretUtil.secretString(password);
            allPasswordService.addUser(adminId, secretPassword);
            adminService.addAdmin(adminId, adminName);
            userRoleService.addRole(adminId, role);
            logService.addLog(adminId, logStatus);
        }
        Map<String,Object> message = new HashMap<>();
        message.put("register_code",registerCode);
        message.put("data",data);
        return new Result().result200(message,path);
    }

    /**
     * 管理员登录
     * @param adminName 管理员用户名
     * @param password 密码
     * @param path url路径
     * @return
     */
    @Override
    public Result adminLogin(String adminName, String password, String logStatus, String path) {
        return null;
    }

    /**
     * 判断密码是否符合要求
     * @param password 密码
     * @return
     */
    private Boolean passwordLen(String password){
        int length = password.length();
        return (length >= 6) && (length <= 20);
    }

    /**
     * 厂家登录
     * @param factoryMsg 厂家用户名
     * @param logStatus 操作状态
     * @param path 请求路径
     * @param token token
     * @return
     */
    @Override
    public Result factoryLogin(FactoryMsg factoryMsg, String logStatus, String path, String token) {
        Map<String, Object> resultMap = new Hashtable<>();
        Map<String, String> tokenMap = new Hashtable<>();

        tokenMap.put("ID", factoryMsg.getFacId());
        tokenMap.put("role", factoryMsg.getURole());
        return new BaseStencilImpl().loginJudge(factoryMsg, resultMap, tokenMap, logStatus, path, token);
    }

    /**
     *
     * @param deliveryMsg 配送员信息
     * @param logStatus 操作状态
     * @param path 请求路径
     * @param token token
     * @return
     */
    @Override
    public Result deliveryLogin(DeliveryMsg deliveryMsg, String logStatus, String path, String token) {
        Map<String, Object> resultMap = new Hashtable<>();
        Map<String, String> tokenMap = new Hashtable<>();

        tokenMap.put("ID", deliveryMsg.getDeId());
        tokenMap.put("role", deliveryMsg.getURole());
        return new BaseStencilImpl().loginJudge(deliveryMsg, resultMap, tokenMap, logStatus, path, token);
    }

    /**
     * @param msg 传入对应的vo
     * @param resultMap result的数据
     * @param tokenMap token中的值
     * @param logStatus 操作状态
     * @param path 请求路径
     * @param token token
     * @return
     */
    public Result loginJudge(Object msg, Map<String, Object> resultMap, Map<String, String> tokenMap,
                             String logStatus, String path, String token) {
        if (msg == null) {
            //账号或密码错误
            resultMap.put("login_code", 0);
            resultMap.put("data", "账号或密码错误");
            return new Result().result200(msg, path);
        } else {
            //判断是否是新登录
            if (token == null) {
                //生成token
                token = JWTUtil.createToken(tokenMap);
                //返回
                resultMap.put("login_code", 1);
                resultMap.put("token", token);
                resultMap.put("data", msg);
                //在记录表中插入数据
                logService.addLog(tokenMap.get("ID"), logStatus);
                return new Result().result200(resultMap, path);
            } else {
                int statusCode = JWTUtil.verify(token);
                if (statusCode == 1) {
                    //登录成功
                    //返回
                    resultMap.put("login_code", 1);
                    resultMap.put("token", token);
                    resultMap.put("data", msg);
                    //在记录表中插入数据
                    logService.addLog(tokenMap.get("ID"), logStatus);
                    return new Result().result200(resultMap, path);

                } else {
                    //token失效或错误
                    resultMap.put("login_code", 0);
                    resultMap.put("token", token);
                    return new Result().result401(resultMap, path);
                }
            }
        }
    }
}
