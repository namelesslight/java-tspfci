package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.DeLoginDto;
import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.DeliveryService;
import com.example.javatspfci.code.service.LogService;
import com.example.javatspfci.code.stencil.LoginStencil;
import com.example.javatspfci.code.util.SecretUtil;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/code/delivery")
public class DeliveryController {
    @Autowired
    private LoginStencil loginStencil;
    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/login")
    public Result deliveryLogin(@RequestBody DeLoginDto deLoginDto, @RequestHeader(value = "token",required = false) String token) {
        //md5加密
        String md5Password = SecretUtil.secretString(deLoginDto.getPassword());
        //查询用户是否存在
        DeliveryMsg deliveryMsg = null;
        try {
            deliveryMsg = deliveryService.deliveryLogin(deLoginDto.getDeUserName(), md5Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取Result
        Result result = loginStencil.deliveryLogin(deliveryMsg, "login", "/code/delivery/login", token);
        return result;
    }
}
