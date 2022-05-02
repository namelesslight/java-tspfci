package com.example.javatspfci.code.entity.dto;

import lombok.Data;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/2 01:22
 */
@Data
public class AdminLoginDto {
    /**
     * 管理员用户名
     */
    private String adminUserName;

    /**
     * 密码
     */
    private String password;
}
