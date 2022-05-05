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
@TableName("tb_delivery")
@ApiModel(value = "Delivery对象", description = "")
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("配送员编号")
    @TableId("de_id")
    private String deId;

    @ApiModelProperty("账户名")
    @TableField("de_user_name")
    private String deUserName;

    @ApiModelProperty("电话号码")
    @TableField("de_phone")
    private String dePhone;

    @ApiModelProperty("配送员图片")
    @TableField("de_picture")
    private String dePicture;

    @ApiModelProperty("配送员厂家所属")
    @TableField("de_factory_id")
    private String deFactoryId;

    @ApiModelProperty("配送员驾驶证图片路径")
    @TableField("de_driving_license")
    private String deDrivingLicense;

    @ApiModelProperty("车辆行驶证图片路径")
    @TableField("de_car_license")
    private String deCarLicense;

    @ApiModelProperty("车牌照")
    @TableField("de_car")
    private String deCar;

    @ApiModelProperty("逻辑删除")
    @TableField("de_delete")
    private Boolean deDelete;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;


}
