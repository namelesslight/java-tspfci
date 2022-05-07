package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/4 20:38
 */

public interface  StoreStencil {
    /**
     * 根据id查询店家信息
     * @param id 店家id
     * @param path 请求路径
     * @return
     */
    public Result getOneStoreById(String id, String path);

    /**
     * 获取全部店家
     * @param page 页数
     * @param count 查询数量
     * @param path url路径
     * @return
     */
    public Result getAllStoreByPage(Integer page,Integer count,String path);

}
