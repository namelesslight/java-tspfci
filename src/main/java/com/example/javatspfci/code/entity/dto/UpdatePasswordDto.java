package com.example.javatspfci.code.entity.dto;

import lombok.Data;

@Data
public class UpdatePasswordDto {

    private String oldPassword;

    private String newPassword;

    private String rwPassword;

}
