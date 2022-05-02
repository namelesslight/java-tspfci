package com.example.javatspfci.code.entity.dto;

import lombok.Data;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/1 20:30
 */

@Data
public class DeLoginDto {
    /**
     * 配送员用户名
     */
    private String deUserName;

    /**
     * 密码
     */
    private String password;
}
