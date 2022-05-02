package com.example.javatspfci.code.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/2 01:21
 */

@Data
public class AdminMsg {

    @ApiModelProperty("管理员编号")
    private String adId;

    @ApiModelProperty("用户名")
    private String adUserName;

    @ApiModelProperty("用户头像")
    private String adUserPicture;

    @ApiModelProperty("配送员密码")
    private String allPassword;

    @ApiModelProperty("角色等级")
    private String uRole;
}
