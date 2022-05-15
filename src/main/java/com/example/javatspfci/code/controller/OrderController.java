package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.order.CreateOrderDto;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.stencil.OrderStencil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZCL
 * @since 2022-05-11
 */
@RestController
@RequestMapping("/code/order")
public class OrderController {

    @Resource
    private OrderStencil orderStencil;

    /**
     * 创建订单
     * @param createOrderDto 后端接收类
     * @return
     */
    @PostMapping("/createOrder")
    public Result createOrder(@RequestBody CreateOrderDto createOrderDto){
        return orderStencil.createOrder(
                createOrderDto.getCreatorId(),
                createOrderDto.getCreatorId(),
                createOrderDto.getValue(),
                createOrderDto.getInfo(),
                createOrderDto.getRemark(),
                createOrderDto.getType(),
                createOrderDto.getPrice(),"/code/order/createOrder");
    }

}
