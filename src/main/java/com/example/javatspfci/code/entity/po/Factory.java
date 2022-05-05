package com.example.javatspfci.code.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
@Getter
@Setter
@TableName("tb_factory")
@ApiModel(value = "Factory对象", description = "")
@ToString
public class Factory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("厂家编号")
    @TableId("fac_id")
    private String facId;

    @ApiModelProperty("账户名")
    @TableField("fac_user_name")
    private String facUserName;

    @ApiModelProperty("厂名")
    @TableField("fac_store_name")
    private String facStoreName;

    @ApiModelProperty("厂家介绍")
    @TableField("fac_store_introduce")
    private String facStoreIntroduce;

    @ApiModelProperty("电话号码")
    @TableField("fac_phone")
    private String facPhone;

    @ApiModelProperty("厂家图片")
    @TableField("fac_picture")
    private String facPicture;

    @ApiModelProperty("厂家地址")
    @TableField("fac_location")
    private String facLocation;

    @ApiModelProperty("经营许可证编号")
    @TableField("fac_lences_id")
    private String facLencesId;

    @ApiModelProperty("逻辑删除")
    @TableField("fac_delete")
    private Boolean facDelete;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;


}
