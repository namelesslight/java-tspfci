package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.entity.po.Tableware;
import com.example.javatspfci.code.result.Result;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

public interface TablewareStencil {

    /**
     * 添加餐具
     * @param factoryId 餐具所属厂家ID
     * @param name 餐具名
     * @param describe 餐具描述
     * @param type 餐具类型
     * @param picture 餐具图片
     * @param size 餐具尺寸
     * @param price 餐具具价格
     * @param stock 餐具库存
     * @param path url路径
     * @return
     */
    public Result addTableware(String factoryId, String name, String describe, String type, String picture, String size,
                               BigDecimal price, int stock, String path);

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
    public Result updateTableware(int id, String factoryId, String name, String describe, String picture, String size,
                                   BigDecimal price, int stock, String path);

    /**
     * 根据id查询餐具信息
     * @param id id
     * @return
     */
    public Result selectTablewareById(int id, String path);

    /**
     * 分页查询餐具信息
     * @param page 开始位置
     * @param count 查多少个
     * @return
     */
    public Result listAllTablewareByPage(Integer page, Integer count, String path);

    /**
     * 查询餐具种类数
     * @return
     */
    public Result countTableware(String path);

    /**
     * 查询指定厂家id餐具种类数
     * @param factoryId 厂家id
     * @return
     */
    public Result countTablewareByFactoryId(String factoryId, String path);

    /**
     * 根据厂家分页查询餐具信息
     * @param factoryId 厂家id
     * @param page 开始位置
     * @param count 查多少个
     * @return
     */
    public Result listTablewareByFactory(String factoryId, Integer page, Integer count, String path);
}
