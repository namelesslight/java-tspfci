package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.vo.FactoryMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.impl.FactoryServiceImpl;
import com.example.javatspfci.code.stencil.impl.BaseStencilImpl;
import com.example.javatspfci.code.util.SecretUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
@RestController
@RequestMapping("/code/factory")
public class FactoryController {

    @Autowired
    private BaseStencilImpl baseStencil;

    @Autowired
    private FactoryServiceImpl factoryService;

    @PostMapping("/login")
    @Transactional
    public Result factoryLogin(@RequestParam("facUserName") String username,
                               @RequestParam("passsword") String password,
                               @RequestParam("token") String token) {
        //md5加密
        String md5Password = SecretUtil.secretString(password);
        //查询用户是否存在
        FactoryMsg factoryMsg = null;
        try {
            factoryMsg = factoryService.factoryLogin(username, md5Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取Result
        Result result = baseStencil.factoryLogin(factoryMsg, "login", "/code/factory/login", token);

        return result;
    }

}
