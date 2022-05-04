package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.FacLoginDto;
import com.example.javatspfci.code.entity.vo.FactoryLoginMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.impl.FactoryServiceImpl;
import com.example.javatspfci.code.stencil.FactoryStencil;
import com.example.javatspfci.code.stencil.LoginStencil;
import com.example.javatspfci.code.util.SecretUtil;
import org.springframework.beans.factory.annotation.Autowired;
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
    private FactoryServiceImpl factoryService;

    @Resource
    private FactoryStencil factoryStencil;

    @PostMapping("/login")
    @Transactional
    public Result factoryLogin(@RequestBody FacLoginDto facLoginDto, @RequestHeader("token") String token) {
        //md5加密
        String md5Password = SecretUtil.secretString(facLoginDto.getPassword());
        //查询用户是否存在
        FactoryLoginMsg factoryMsg = null;
        try {
            factoryMsg = factoryService.factoryLogin(facLoginDto.getFacUserName(), md5Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取Result
        Result result = loginStencil.factoryLogin(factoryMsg, "login", "/code/factory/login", token);

        return result;
    }

    /**
     * 查询
     * @param page 页数
     * @param count 查询数量
     * @return
     */
    @GetMapping("/getAllFactoryByPage")
    public Result getAllFactoryByPage(@RequestParam Integer page,
                                       @RequestParam Integer count){
        return factoryStencil.getAllFactoryByPage(page,count,"/code/factory/getAllFactoryByPage");
    }

    /**
     * 通过id查询配送员
     * @param id 配送员id
     * @return
     */
    @GetMapping("/getOneFactoryByID")
    public Result getOneFactoryByID(@RequestParam String id){
        return factoryStencil.getOneFactoryByID(id,"/code/factory/getOneFactoryByID");
    }

}
