package com.example.javatspfci.code.entity.dto.order;

import lombok.Data;

/**
 * 设置订单配送员
 */
@Data
public class SetOrderDeliveryDto {

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 配送员ID
     */
    private String deliveryId;

}
