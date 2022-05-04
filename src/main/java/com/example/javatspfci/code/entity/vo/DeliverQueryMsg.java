package com.example.javatspfci.code.entity.vo;

import lombok.Data;

@Data
public class DeliverQueryMsg {

    /**
     * 配送员id
     */
    private String id;

    /**
     * 配送员用户名
     */
    private String username;

    /**
     * 配送员电话
     */
    private String  phone;

    /**
     * 配送员头像图片路径
     */
    private String picture;

    /**
     * 配送员车配图片路径
     */
    private String car;

}
