package com.example.javatspfci.code.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("tb_log")
@ApiModel(value = "Log对象", description = "")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录自增主键")
    @TableId(value = "log_id", type = IdType.AUTO)
    private Integer logId;

    @ApiModelProperty("用户对应id")
    @TableField("log_user")
    private String logUser;

    @ApiModelProperty("操作状态")
    @TableField("log_status")
    private String logStatus;

    @ApiModelProperty("操作时间")
    @TableField("log_time")
    private LocalDateTime logTime;


}
