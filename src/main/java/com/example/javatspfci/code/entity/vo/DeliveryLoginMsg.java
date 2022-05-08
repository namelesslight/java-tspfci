package com.example.javatspfci.code.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/1 16:42
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("配送员实体")
public class DeliveryLoginMsg {

    @ApiModelProperty("配送员编号")
    private String deId;

    @ApiModelProperty("账户名")
    private String deUserName;

    @ApiModelProperty("电话号码")
    private String dePhone;

    @ApiModelProperty("配送员图片")
    private String dePicture;

    @ApiModelProperty("配送员厂家所属")
    private String deFactoryId;

    @ApiModelProperty("配送员驾驶证图片路径")
    private String deDrivingLicense;

    @ApiModelProperty("车辆行驶证图片路径")
    private String deCarLicense;

    @ApiModelProperty("车牌照")
    private String deCar;

    @ApiModelProperty("配送员密码")
    private String password;

    @ApiModelProperty("逻辑删除")
    private Boolean deDelete;

    @ApiModelProperty("角色等级")
    private String uRole;
}
