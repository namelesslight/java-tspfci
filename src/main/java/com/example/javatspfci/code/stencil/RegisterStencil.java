package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

import java.io.IOException;

/**
 * 通用Service接口
 */
public interface RegisterStencil {

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

}
