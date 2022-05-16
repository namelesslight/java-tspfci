package com.example.javatspfci.code.entity.dto.order;

import lombok.Data;

@Data
public class OrderOtherDto {

    /**
     * 餐具ID
     */
    private Integer id;

    /**
     * 餐具名
     */
    private String name;

    /**
     * 餐具数量
     */
    private Integer count;

    /**
     * 餐具价格
     */
    private  Double price;

}
