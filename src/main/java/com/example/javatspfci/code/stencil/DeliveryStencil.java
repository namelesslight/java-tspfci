package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

public interface DeliveryStencil {

    /**
     * 获取全部配送员
     * @param page 页数
     * @param count 查询数量
     * @param path url路径
     * @return
     */
    public Result getAllDeliveryByPage(Integer page,Integer count,String path);

    /**
     * 通过工厂ID获取配送员
     * @param factoryId 工厂ID
     * @param page 页数
     * @param count 查询数据数量
     * @param path url路径
     * @return
     */
    public Result listDeliveryByFactory(String factoryId,Integer page, Integer count, String path);

    /**
     * 通过id获取单个配送员信息
     * @param delID 配送员ID
     * @param path url路径
     * @return
     */
    public Result getOneDeliveryByID(String delID, String path);



}
