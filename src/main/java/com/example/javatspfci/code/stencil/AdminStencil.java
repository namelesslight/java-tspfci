package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.entity.vo.AdminLoginMsg;
import com.example.javatspfci.code.result.Result;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/4 20:37
 */
public interface AdminStencil {
    /**
     * 根据id查询管理员
     * @param id 管理员id
     * @param path 请求路径
     * @return
     */
    public Result getOneAdminById(String id, String path);
}
