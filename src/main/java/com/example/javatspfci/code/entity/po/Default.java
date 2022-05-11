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
@TableName("tb_default")
@ApiModel(value = "Default对象", description = "")
public class Default implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("默认配餐编号")
    @TableId(value = "def_id", type = IdType.AUTO)
    private Integer defId;

    @ApiModelProperty("对应厂家")
    @TableField("def_factory")
    private String defFactory;

    @ApiModelProperty("配餐图片路径")
    @TableField("def_picture")
    private String defPicture;

    @ApiModelProperty("配餐价格")
    @TableField("def_price")
    private BigDecimal defPrice;

    @ApiModelProperty("配餐名")
    @TableField("def_name")
    private String defName;

    @ApiModelProperty("配餐信息")
    @TableField("def_info")
    private String defInfo;

    @ApiModelProperty("套件库存")
    @TableField("def_stock")
    private Integer defStock;

    @ApiModelProperty("逻辑删除")
    @TableField("is_delete")
    private Boolean isDelete;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;


}
