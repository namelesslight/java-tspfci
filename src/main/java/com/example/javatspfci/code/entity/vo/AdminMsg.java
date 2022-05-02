package com.example.javatspfci.code.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/2 01:21
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("厂家实体")
public class AdminMsg {

    @ApiModelProperty("管理员编号")
    private String adId;

    @ApiModelProperty("用户名")
    private String adUserName;

    @ApiModelProperty("用户头像")
    private String adUserPicture;

    @ApiModelProperty("配送员密码")
    private String password;

    @ApiModelProperty("角色等级")
    private String uRole;
}
