package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.entity.vo.AdminMsg;
import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.entity.vo.FactoryMsg;
import com.example.javatspfci.code.result.Result;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/2 00:14
 */
public interface LoginStencil {
    /**
     * 用户登录
     * @param phone 电话号码
     * @param password 密码
     * @param  logStatus 操作状态
     * @param  path url路径
     * @return
     */
    public Result userLogin(String phone, String password, String logStatus, String path);

    /**
     * 管理员登录
     * @param adminMsg 管理员信息
     * @param logStatus 操作状态
     * @param path url路径
     * @param token token
     * @return
     */
    public Result adminLogin(AdminMsg adminMsg, String logStatus, String path, String token);

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
     * 配送员登录
     * @param deliveryMsg 配送员信息
     * @param logStatus 操作状态
     * @param path 请求路径
     * @param token token
     * @return
     */
    public Result deliveryLogin(DeliveryMsg deliveryMsg, String logStatus, String path, String token);
}
