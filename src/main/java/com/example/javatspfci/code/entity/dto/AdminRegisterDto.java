package com.example.javatspfci.code.entity.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 管理员注册
 */
@Getter
@Setter
@ToString
public class AdminRegisterDto {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 确认密码
     */
    private String rwPassword;

    /**
     * 权限
     */
    private String role;

    /**
     * 操作状态
     */
    private String logStatus;

}
