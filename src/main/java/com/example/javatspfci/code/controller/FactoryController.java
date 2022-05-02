package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.FacLoginDto;
import com.example.javatspfci.code.entity.vo.FactoryMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.FactoryService;
import com.example.javatspfci.code.service.LogService;
import com.example.javatspfci.code.service.impl.FactoryServiceImpl;
import com.example.javatspfci.code.stencil.BaseStencil;
import com.example.javatspfci.code.stencil.LoginStencil;
import com.example.javatspfci.code.stencil.impl.BaseStencilImpl;
import com.example.javatspfci.code.util.SecretUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    private LoginStencil loginStencil;

    @Autowired
    private FactoryService factoryService;

    @PostMapping("/login")
    public Result factoryLogin(@RequestBody FacLoginDto facLoginDto, @RequestHeader(value = "token", required = false) String token) {
        //md5加密
        String md5Password = SecretUtil.secretString(facLoginDto.getPassword());
        //查询用户是否存在
        FactoryMsg factoryMsg = null;
        try {
            factoryMsg = factoryService.factoryLogin(facLoginDto.getFacUserName(), md5Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取Result
        Result result = loginStencil.factoryLogin(factoryMsg, "login", "/code/factory/login", token);

        return result;
    }

}
