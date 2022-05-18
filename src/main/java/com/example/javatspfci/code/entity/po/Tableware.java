package com.example.javatspfci.code.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
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
@Data
@TableName("tb_tableware")
@ApiModel(value = "Tableware对象", description = "")
public class Tableware implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("餐具编号")
    @TableId(value = "tab_id", type = IdType.AUTO)
    private Integer tabId;

    @ApiModelProperty("对应厂家")
    @TableField("tab_factory")
    private String tabFactory;

    @ApiModelProperty("餐具名")
    @TableField("tab_name")
    private String tabName;

    @ApiModelProperty("餐具描述")
    @TableField("tab_describe")
    private String tabDescribe;

    @ApiModelProperty("类别")
    @TableField("tab_type")
    private String tabType;

    @ApiModelProperty("餐具图片")
    @TableField("tab_picture")
    private String tabPicture;

    @ApiModelProperty("处理值")
    @TableField("tab_value")
    private Integer tabValue;

    @ApiModelProperty("餐具大小")
    @TableField("tab_size")
    private String tabSize;

    @ApiModelProperty("餐具价格")
    @TableField("tab_price")
    private BigDecimal tabPrice;

    @ApiModelProperty("餐具库存")
    @TableField("tab_stock")
    private Integer tabStock;

    @ApiModelProperty("逻辑删除")
    @TableField("is_delete")
    private Boolean isDelete;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;


}
