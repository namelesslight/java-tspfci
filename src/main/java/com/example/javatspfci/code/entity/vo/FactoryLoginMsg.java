package com.example.javatspfci.code.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/30 15:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("厂家实体")
public class FactoryLoginMsg {

    @ApiModelProperty("厂家编号")
    private String facId;

    @ApiModelProperty("账户名")
    private String facUserName;

    @ApiModelProperty("厂名")
    private String facStoreName;

    @ApiModelProperty("厂家介绍")
    private String facStoreIntroduct;

    @ApiModelProperty("电话号码")
    private String facPhone;

    @ApiModelProperty("厂家图片")
    private String facPicture;

    @ApiModelProperty("厂家地址")
    private String facLocation;

    @ApiModelProperty("经营许可证编号")
    private String facLencesId;

    @ApiModelProperty("厂家密码")
    private String password;

    @ApiModelProperty("角色等级")
    private String uRole;
}
