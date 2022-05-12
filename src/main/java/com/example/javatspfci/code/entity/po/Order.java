package com.example.javatspfci.code.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZCL
 * @since 2022-05-11
 */
@Getter
@Setter
@TableName("tb_order")
@ApiModel(value = "Order对象", description = "")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单号")
    @TableId("order_id")
    private String orderId;

    @ApiModelProperty("订单创建者")
    @TableField("order_creator")
    private String orderCreator;

    @ApiModelProperty("订单接收者")
    @TableField("order_receiver")
    private String orderReceiver;

    @ApiModelProperty("订单总价")
    @TableField("order_price")
    private BigDecimal orderPrice;

    @ApiModelProperty("订单内容")
    @TableField("order_info")
    private String orderInfo;

    @ApiModelProperty("订单受理人")
    @TableField("order_delivery")
    private String orderDelivery;

    @ApiModelProperty("订单状态")
    @TableField("order_status")
    private Integer orderStatus;

    @ApiModelProperty("订单备注")
    @TableField("order_remark")
    private String orderRemark;

    @ApiModelProperty("订单异常信息")
    @TableField("order_error_reason")
    private String orderErrorReason;

    @ApiModelProperty("订单创建时间")
    @TableField("order_create_time")
    private LocalDateTime orderCreateTime;

    @ApiModelProperty("订单类型")
    @TableField("order_type")
    private String orderType;


}
