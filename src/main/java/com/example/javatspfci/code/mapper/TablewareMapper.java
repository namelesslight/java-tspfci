package com.example.javatspfci.code.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.models.auth.In;
import com.example.javatspfci.code.entity.po.Tableware;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ZCL
 * @since 2022-05-11
 */
@Mapper
public interface TablewareMapper extends BaseMapper<Tableware> {
    /**
     * 厂家添加餐具
     *
     * @param factoryId  对应厂家id
     * @param name     餐具名
     * @param describe 餐具描述
     * @param type     商品类别
     * @param picture  图片路径
     * @param size     餐具大小
     * @param price    餐具价格
     * @param stock    库存
     * @param value    处理值
     * @return
     */
    public Integer addTableware(String factoryId, String name, String describe, String type, String picture, String size,
                                BigDecimal price, int stock, int value);

    /**
     * 厂家修改餐具
     * @param id id
     * @param factoryId  对应厂家id
     * @param name     餐具名
     * @param describe 餐具描述
     * @param picture  图片路径
     * @param size     餐具大小
     * @param price    餐具价格
     * @param stock    库存
     * @return
     */
    public Integer updateTableware(int id, String factoryId, String name, String describe, String picture, String size,
                                   BigDecimal price, int stock);

    /**
     * 根据id查询餐具信息
     * @param id id
     * @return
     */
    public Tableware selectTablewareById(int id);

    /**
     * 分页查询餐具信息
     * @param start 开始位置
     * @param count 查多少个
     * @return
     */
    public List<Tableware> listAllTablewareByPage(Integer start, Integer count);

    /**
     * 查询所有餐具种类数
     * @return
     */
    public Integer countTableware();

    /**
     * 查询指定厂家id餐具种类数
     * @param factoryId 厂家id
     * @return
     */
    public Integer countTablewareByFactoryId(String factoryId);

    /**
     * 根据厂家分页查询餐具信息
     * @param factoryId 厂家id
     * @param start 开始位置
     * @param count 查多少个
     * @return
     */
    public List<Tableware> listTablewareByFactory(String factoryId, Integer start, Integer count);
}
