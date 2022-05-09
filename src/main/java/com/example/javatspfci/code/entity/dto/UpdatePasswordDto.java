package com.example.javatspfci.code.entity.dto;

import lombok.Data;

/**
 * 修改密码
 */
@Data
public class UpdatePasswordDto {

    /**
     * 用户ID
     */
    private String id;

    /**
     * 旧密码
     */
    private String oldPassword;

    /**
     * 新密码
     */
    private String newPassword;

    /**
     * 确认密码
     */
    private String rwPassword;

}
