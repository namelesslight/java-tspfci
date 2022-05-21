package com.example.javatspfci.code.entity.dto.tableware;

import lombok.Data;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/19 13:52
 */
@Data
public class TablewareConditionDto {
    /**
     * 餐具类型
     */
    private String tabType;
    /**
     * 工厂id
     */
    private String tabFactoryId;
    /**
     * 开始页数
     */
    private Integer page;
    /**
     * 查多少个
     */
    private Integer count;
}
