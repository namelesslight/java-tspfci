package com.example.javatspfci.code.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/1 20:30
 */

@Data
@ApiModel(value = "Admin对象", description = "")
public class DeLoginDto {
    /**
     * 配送员用户名
     */
    @ApiModelProperty("配送员姓名")
    private String deUserName;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;
}
