package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

public interface ComboStencil {

    /**
     * 添加组合
     * @param factoryId
     * @param storeId
     * @param price
     * @param name
     * @param info
     * @param path
     * @return
     */
    public Result addCombo(String factoryId, String storeId, Integer price,String name,String info, String path);

}
