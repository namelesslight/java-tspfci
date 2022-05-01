package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.entity.vo.FactoryMsg;
import com.example.javatspfci.code.result.Result;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 通用Service接口
 */
public interface BaseStencil {

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
    public Result userRegister(String name, String phone,String role, String password, String rwPassword,String logStatus, String path);

    /**
     * 用户登录
     * @param phone 电话号码
     * @param password 密码
     * @param  logStatus 操作状态
     * @param  path url路径
     * @return
     */
    public Result userLogin(String phone, String password,String logStatus, String path);

    /**
     * 管理员注册
     * @param adminName 管理员用户名
     * @param password 密码
     * @param rwPassword 确认密码
     * @param headPicture 管理员头像
     * @param role 角色权限
     * @param logStatus 操作状态
     * @param  path url路径
     * @return
     */
    public Result adminRegister(String adminName, String password, String rwPassword, String role, String logStatus, String path) throws IOException;

    /**
     * 管理员登录
     * @param adminName 管理员用户名
     * @param password 密码
     * @param logStatus 操作状态
     * @param  path url路径
     * @return
     */
    public Result adminLogin(String adminName, String password,String logStatus, String path);

    /**
     * 厂家登录
     * @param factoryMsg 厂家信息
     * @param logStatus 操作状态
     * @param path 请求路径
     * @param token token
     * @return
     */
    public Result factoryLogin(FactoryMsg factoryMsg, String logStatus, String path, String token);

    /**
     *
     * @param deliveryMsg 配送员信息
     * @param logStatus 操作状态
     * @param path 请求路径
     * @param token token
     * @return
     */
    public Result deliveryLogin(DeliveryMsg deliveryMsg, String logStatus, String path, String token);
}
