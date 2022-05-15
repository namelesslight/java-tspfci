package com.example.javatspfci.code.stencil.impl;

import com.example.javatspfci.code.entity.dto.order.OrderInfoDto;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.OrderService;
import com.example.javatspfci.code.stencil.OrderStencil;
import com.example.javatspfci.code.util.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class OrderStencilImpl implements OrderStencil {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     * @param creatorId 店家ID
     * @param receiverId 厂家ID
     * @param value 权值
     * @param info 订单内容
     * @param remark 备注
     * @param type 订单类型
     * @param price 订单价格
     * @param path url路径
     * @return
     */
    @Override
    public Result createOrder(String creatorId, String receiverId, Integer value, OrderInfoDto info, String remark, String type, Double price, String path) {
        //生成UUID
        Map<String, Object> message = new HashMap<>();
        int createCode = 1;
        String id = UUIDUtil.getUUID();
        Integer orderStatus = 0;
        BigDecimal bigPrice = new BigDecimal(price);
        boolean createJudge = orderService.createOrder(id, creatorId, receiverId, info.toString(), remark, type, bigPrice, orderStatus);
        if (!createJudge){
            createCode = 0;
        }
        message.put("create_code",createCode);
        return new Result().result200(message,path);
    }

    /**
     * 指派配送员
     * @param orderId 订单ID
     * @param deliveryId 配送员ID
     * @param path url路径
     * @return
     */
    @Override
    public Result setOrderDelivery(String orderId, String deliveryId, String path) {
        return null;
    }

    /**
     * 通过店家ID查询订单信息
     * @param storeId 店家ID
     * @param path url路径
     * @return
     */
    @Override
    public Result listOrderByStore(String storeId, String path) {
        return null;
    }

    /**
     * 通过厂家ID查询订单信息
     * @param factoryId 厂家ID
     * @param path url路径
     * @return
     */
    @Override
    public Result listOrderByFactory(String factoryId, String path) {
        return null;
    }

    /**
     * 通过配送员ID查询订单信息
     * @param deliveryId 配送员ID
     * @param path url路径
     * @return
     */
    @Override
    public Result listOrderByDelivery(String deliveryId, String path) {
        return null;
    }

    /**
     * 查询单个订单信息
     * @param orderId 订单ID
     * @param path url路径
     * @return
     */
    @Override
    public Result queryOneOrder(String orderId, String path) {
        return null;
    }

    /**
     * 更改订单状态
     * @param orderId 订单ID
     * @param statusCode 订单状态
     * @param path url路径
     * @return
     */
    @Override
    public Result updateOrderStatus(String orderId, Integer statusCode, String path) {
        return null;
    }

    /**
     * 取消订单
     * @param orderId 订单ID
     * @param reason 取消原因
     * @param path url路径
     * @return
     */
    @Override
    public Result orderCancel(String orderId, String reason, String path) {
        return null;
    }
}
