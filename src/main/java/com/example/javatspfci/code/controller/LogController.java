package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.stencil.UserLogStencil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/code/log")
public class LogController {

    @Resource
    private UserLogStencil userLogStencil;

    @GetMapping("/queryLogPageByRole")
    public Result queryLogPageByRole(@RequestParam String role,
                                     @RequestParam Integer page,
                                     @RequestParam Integer count){
        return userLogStencil.queryUserLogByPage(role, page, count, "/base/queryLogPageByRole");
    }

}
