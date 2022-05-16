package com.example.javatspfci.code.entity.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderQueryMsg {

    /**
     * 店家ID
     */
    private String storeId;

    /**
     * 店名
     */
    private String storeName;

    /**
     * 店主姓名
     */
    private String storeOwnerName;

    /**
     * 店家号码
     */
    private String storePhone;

    /**
     * 店家地址
     */
    private String storeLocation;

    /**
     * 店家图片路径
     */
    private String storePicture;

    /**
     * 厂家ID
     */
    private String factoryId;

    /**
     * 厂名
     */
    private String factoryName;

    /**
     * 厂家电话
     */
    private String factoryPhone;

    /**
     * 厂家图片路径
     */
    private String factoryPicture;

    /**
     * 厂家地址
     */
    private String factoryLocation;

    /**
     * 配送员ID
     */
    private String deliveryId;

    /**
     * 配送员姓名
     */
    private String deliveryName;

    /**
     * 配送员电话
     */
    private String deliveryPhone;

    /**
     * 配送员头像路径
     */
    private String deliveryPicture;

    /**
     * 配送员车牌图片路径
     */
    private String deliveryCarCode;

    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 订单价格
     */
    private BigDecimal price;

    /**
     * 订单信息
     */
    private String info;

    /**
     * 订单状态码
     */
    private Integer status;

    /**
     * 订单取消原因
     */
    private String orderErrorReason;

    /**
     * 订单类型
     */
    private String orderType;

    /**
     * 订单时间
     */
    private LocalDateTime createTime;

}
