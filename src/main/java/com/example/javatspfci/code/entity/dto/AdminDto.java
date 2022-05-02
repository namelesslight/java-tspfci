package com.example.javatspfci.code.entity.dto;

import lombok.Data;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/2 01:22
 */
@Data
public class AdminDto {
    /**
     * 管理员用户名
     */
    private String adminUsername;

    /**
     * 密码
     */
    private String password;
}
