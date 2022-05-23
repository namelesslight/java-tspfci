package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

public interface ComboStencil {

    /**
     * 添加组合
     * @param factoryId 厂家ID
     * @param storeId 店家ID
     * @param price 价格
     * @param name 姓名
     * @param info 配套信息
     * @param path url路径
     * @return
     */
    public Result addCombo(String factoryId, String storeId, Integer price,String name,String info, String path);

    /**
     * 查看组合
     * @param storeId 店家ID
     * @param factoryId 厂家ID
     * @param path url路径
     * @return
     */
    public Result listComboByStore(String storeId,String factoryId, String path);

    /**
     * 删除组合
     * @param comboId 配套ID
     * @param path 厂家
     * @return
     */
    public Result deleteCombo(Integer comboId, String path);

}
