package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;
import org.springframework.web.multipart.MultipartFile;

public interface TablewareStencil {

    /**
     * 添加餐具
     * @param factoryId 餐具所属厂家ID
     * @param name 餐具名
     * @param describe 餐具描述
     * @param type 餐具类型
     * @param picture 餐具图片
     * @param price 餐具具价格
     * @param stock 餐具库存
     * @param path url路径
     * @return
     */
    public Result addTableware(String factoryId, String name, String describe,String type, MultipartFile picture,
                               Double price, Integer stock, String path);

    /**
     * 根据工厂编号查询所有餐具
     * @param factoryId 工厂ID
     * @param path url路径
     * @return
     */
    public Result listTablewareByFactory(String factoryId, String path);

    /**
     * 根据id获取单个餐具详情
     * @param id 餐具ID
     * @return
     */
    public Result queryOneTablewareById(Integer id);

    /**
     * 更改餐具信息
     * @param id 餐具所属厂家ID
     * @param name 餐具名
     * @param describe 餐具描述
     * @param type 餐具类型
     * @param picture 餐具图片
     * @param price 餐具具价格
     * @param stock 餐具库存
     * @param path url路径
     * @return
     */
    public Result updateTableware(Integer id, String name, String describe,String type, MultipartFile picture,
                                  Double price, Integer stock, String path);
}
