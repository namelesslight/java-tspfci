package com.example.javatspfci.code.entity.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户注册接收类
 */
@Getter
@Setter
@ToString
public class UserRegisterDto {

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户权限
     */
    private String role;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 确认密码
     */
    private String rwPassword;

    /**
     * 操作状态
     */
    private String logStatus;

}
