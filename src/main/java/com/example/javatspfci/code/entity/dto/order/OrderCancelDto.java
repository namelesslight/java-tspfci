package com.example.javatspfci.code.entity.dto.order;

import lombok.Data;

/**
 * 取消订单接收类
 */
@Data
public class OrderCancelDto {

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 退订原因
     */
    private String reason;

}
