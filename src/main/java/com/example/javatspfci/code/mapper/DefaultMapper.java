package com.example.javatspfci.code.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.javatspfci.code.entity.po.Default;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Katechian
 * @since 2022-05-11
 */
@Mapper
public interface DefaultMapper extends BaseMapper<Default> {
    /**
     * 添加套餐
     * @param factoryId 对应厂家id
     * @param picture 图片路径
     * @param price 总价格
     * @param name 套餐名
     * @param info 套餐内容
     * @param stock 库存数
     * @return
     */
    public Integer addCombo(String factoryId, String picture, BigDecimal price, String name, String info, int stock);

    /**
     * 修改套餐
     * @param id id
     * @param factoryId 对应厂家id
     * @param picture 图片路径
     * @param price 总价格
     * @param name 套餐名
     * @param info 套餐内容
     * @param stock 库存数
     * @return
     */
    public Integer updateCombo(int id, String factoryId, String picture, BigDecimal price, String name, String info, int stock);

    /**
     * 根据id查询套餐
     * @param id id
     * @return
     */
    public Default selectComboById(int id);

    /**
     * 分页查询套餐信息
     * @param start 开始位置
     * @param count 查多少个
     * @return
     */
    public List<Default> listAllComboByPage(Integer start, Integer count);

    /**
     * 查询所有套餐种类数
     * @return
     */
    public Integer countCombo();

    /**
     * 查询指定厂家套餐种类数
     * @param factoryId 厂家id
     * @return
     */
    public Integer countComboByFactoryId(String factoryId);

    /**
     * 根据厂家分页查询套餐信息
     * @param factoryId 厂家id
     * @param start 开始位置
     * @param count 查多少个
     * @return
     */
    public List<Default> listComboByFactory(String factoryId, Integer start, Integer count);
}
