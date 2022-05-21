package com.example.javatspfci.code.entity.dto;

import lombok.Data;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/1 20:27
 */

@Data
public class FacLoginDto {
    /**
     * 厂家电话
     */

    private String facPhone;

    /**
     * 密码
     */
    private String password;
}
