package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Order;
import com.example.javatspfci.code.mapper.OrderMapper;
import com.example.javatspfci.code.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
