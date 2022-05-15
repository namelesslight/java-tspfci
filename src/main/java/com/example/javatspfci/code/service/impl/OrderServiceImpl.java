package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.dto.order.OrderInfoDto;
import com.example.javatspfci.code.entity.po.Order;
import com.example.javatspfci.code.mapper.OrderMapper;
import com.example.javatspfci.code.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZCL
 * @since 2022-05-11
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    /**
     * 添加订单
     * @param orderId 订单号
     * @param creatorId 店家编号
     * @param receiverId 厂家信息
     * @param info 订单信息
     * @param remark 备注信息
     * @param type 订单类型
     * @param price 订单价格
     * @param status 订单状态
     * @return
     */
    @Override
    public Boolean createOrder(String orderId, String creatorId, String receiverId, String info, String remark, String type, BigDecimal price, Integer status) {
        return orderMapper.createOrder(orderId, creatorId, receiverId, info, remark, type, price, status) == 1;
    }
}
