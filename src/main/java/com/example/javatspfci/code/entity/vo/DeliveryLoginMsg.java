package com.example.javatspfci.code.entity.vo;

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

    @ApiModelProperty("车牌照")
    private String deCar;

    @ApiModelProperty("配送员密码")
    private String password;

    @ApiModelProperty("角色等级")
    private String uRole;
}
