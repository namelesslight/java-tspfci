package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;

public interface UserLogStencil {

    /**
     * 分页获取记录
     * @param role 权限
     * @param page 查询页数
     * @param count 查询个数
     * @param path url路径
     * @return
     */
    public Result queryUserLogByPage(String role,Integer page, Integer count,String path);

}
