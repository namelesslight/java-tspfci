package com.example.javatspfci.code.entity.dto;

import lombok.Data;

@Data
public class DeliveryRegisterDto {

    /**
     * 用户名
     */
    private String username;

    /**
     * 对应工厂编号
     */
    private String factoryId;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 操作状态
     */
    private String logStatus;



}
