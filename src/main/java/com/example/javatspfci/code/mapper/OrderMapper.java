package com.example.javatspfci.code.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.javatspfci.code.entity.po.Order;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ZCL
 * @since 2022-05-11
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

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
    public Integer createOrder(String orderId, String creatorId, String receiverId, String info, String remark, String type, BigDecimal price, Integer status);

}
