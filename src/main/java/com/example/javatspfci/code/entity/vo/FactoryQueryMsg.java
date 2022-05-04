package com.example.javatspfci.code.entity.vo;

import lombok.Data;

@Data
public class FactoryQueryMsg {

    /**
     * 厂家id
     */
    private String id;

    /**
     * 厂家电话
     */
    private String  phone;

    /**
     * 厂家名称
     */
    private String factoryName;

    /**
     * 厂家介绍
     */
    private String introduce;

    /**
     * 厂家图片
     */
    private String picture;

    /**
     * 厂家地址
     */
    private String location;

}
