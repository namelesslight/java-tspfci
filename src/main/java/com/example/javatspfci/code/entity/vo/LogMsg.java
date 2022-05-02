package com.example.javatspfci.code.entity.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 记录表查询结果
 */
@Data
public class LogMsg {

    /**
     * 记录编号
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 操作状态
     */
    private String logStatus;

    /**
     * 操作时间
     */
    private LocalDateTime logTime;

}
