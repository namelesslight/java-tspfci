package com.example.javatspfci.code.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description
 * @Author: Katechian
 * @CreateTime: 2022/5/17 23:12
 */
@Data
public class TablewareDto {
    @ApiModelProperty("餐具编号")
    private Integer tabId;

    @ApiModelProperty("对应厂家")
    private String tabFactoryId;

    @ApiModelProperty("餐具名")
    private String tabName;

    @ApiModelProperty("餐具描述")
    private String tabDescribe;

    @ApiModelProperty("类别")
    private String tabType;

    @ApiModelProperty("餐具图片")
    private String tabPicture;

    @ApiModelProperty("处理值")
    private Integer tabValue;

    @ApiModelProperty("餐具大小")
    private String tabSize;

    @ApiModelProperty("餐具价格")
    private BigDecimal tabPrice;

    @ApiModelProperty("餐具库存")
    private Integer tabStock;
}
