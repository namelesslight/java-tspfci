package com.example.javatspfci.code.entity.dto.order;

import lombok.Data;

/**
 * 更改订单状态接收类
 */
@Data
public class UpdateOrderStatusDto {

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 订单状态码
     */
    private Integer orderStatus;

}
