package com.example.javatspfci.code.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.javatspfci.code.entity.po.Default;
import com.example.javatspfci.code.entity.po.Tableware;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZCL
 * @since 2022-05-11
 */
public interface DefaultService extends IService<Default> {
    /**
     * 添加套餐
     * @param factory 对应厂家
     * @param picture 图片路径
     * @param price 总价格
     * @param name 套餐名
     * @param info 套餐内容
     * @param stock 库存数
     * @return
     */
    public Integer addCombo(String factory, String picture, BigDecimal price, String name, String info, int stock);

    /**
     * 修改套餐
     * @param id id
     * @param factory 对应厂家
     * @param picture 图片路径
     * @param price 总价格
     * @param name 套餐名
     * @param info 套餐内容
     * @param stock 库存数
     * @return
     */
    public Integer updateCombo(int id, String factory, String picture, BigDecimal price, String name, String info, int stock);

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
     * @param facName 厂家名
     * @param start 开始位置
     * @param count 查多少个
     * @return
     */
    public List<Default> listComboByFactory(String facName, Integer start, Integer count);

}
