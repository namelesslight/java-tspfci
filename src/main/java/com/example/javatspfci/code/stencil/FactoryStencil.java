package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

public interface FactoryStencil {

    /**
     * 分页获取全部厂家
     * @param page 页数
     * @param count 查询数量
     * @param path url路径
     * @return
     */
    public Result getAllFactoryByPage(Integer page, Integer count, String path);

    /**
     * 通过id获取单个厂家信息
     * @param delID 配送员ID
     * @param path url路径
     * @return
     */
    public Result getOneFactoryByID(String delID, String path);


}
