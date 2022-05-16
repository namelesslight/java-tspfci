package com.example.javatspfci.code.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.javatspfci.code.entity.po.Tableware;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ZCL
 * @since 2022-05-11
 */
@Mapper
public interface TablewareMapper extends BaseMapper<Tableware> {
    /**
     * 厂家添加餐具
     * @param factory 对应厂家
     * @param name 餐具名
     * @param describe 餐具描述
     * @param type 商品类别
     * @param picture 图片路径
     * @param size 餐具大小
     * @param price 餐具价格
     * @param stock 库存
     * @param value 处理值
     * @return
     */
    public Integer addTableware(String factory, String name, String describe, Integer type, String picture, String size,
                                BigDecimal price, int stock, int value);

}
