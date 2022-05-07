package com.example.javatspfci.code.stencil.impl;

import com.example.javatspfci.code.entity.vo.AdminLoginMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.AdminService;
import com.example.javatspfci.code.stencil.AdminStencil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/4 20:37
 */
@Service
public class AdminStencilImpl implements AdminStencil {
    @Autowired
    private AdminService adminService;

    @Override
    public Result getOneAdminById(String id, String path) {
        AdminLoginMsg adminMsg = null;
        Map<String,Object> message = new HashMap<>();

        try {
            adminMsg = adminService.queryAdminById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (adminMsg == null){
            message.put("data", "查无此人");
        } else {
            message.put("data", adminMsg);
        }
        return new Result().result200(message, path);
    }
}
