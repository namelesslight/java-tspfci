package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.entity.vo.AdminMsg;
import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.entity.vo.FactoryMsg;
import com.example.javatspfci.code.entity.vo.StoreMsg;
import com.example.javatspfci.code.result.Result;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/2 00:14
 */
public interface LoginStencil {
    /**
     * 用户(店家)登录
     * @param storeMsg  店家信息
     * @param logStatus 操作状态
     * @param path      url路径
     * @param token     token
     * @return
     */
    public Result storeLogin(StoreMsg storeMsg, String logStatus, String path, String token);

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
