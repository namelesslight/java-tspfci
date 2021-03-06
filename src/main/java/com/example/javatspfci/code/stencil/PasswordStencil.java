package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

import java.io.IOException;

/**
 * 通用Service接口
 */
public interface PasswordStencil {

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
     * 配送员注册
     * @param name 姓名
     * @param phone 电话号码
     * @param factoryId 配送员厂家ID
     * @param role 权限名
     * @param logStatus 操作状态
     * @param path url路径
     * @return
     */
    public Result deliveryRegister(String name, String phone,String factoryId, String role, String logStatus, String path);

    /**
     * 管理员注册
     * @param adminName 管理员用户名
     * @param password 密码
     * @param rwPassword 确认密码
     * @param role 角色权限
     * @param logStatus 操作状态
     * @param  path url路径
     * @return
     */
    public Result adminRegister(String adminName, String password, String rwPassword, String role, String logStatus, String path) throws IOException;

    /**
     * 修改密码
     * @param id 用户id
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @param rwPassword 确认密码
     * @param path url路径
     * @return
     */
    public Result updatePassword(String id,String oldPassword, String newPassword, String rwPassword, String path);

}
