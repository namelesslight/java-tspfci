package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.AdminRegisterDto;
import com.example.javatspfci.code.entity.dto.DeliveryRegisterDto;
import com.example.javatspfci.code.entity.dto.UserRegisterDto;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.stencil.RegisterStencil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
@RestController
@RequestMapping("/base")
public class AllPasswordController {

    @Resource
    private RegisterStencil baseStencil;

    @PutMapping("/userRegister")
    public Result userRegister(@RequestBody UserRegisterDto userRegisterDto){
        return baseStencil.userRegister(
                userRegisterDto.getUsername(),
                userRegisterDto.getPhone(),
                userRegisterDto.getRole(),
                userRegisterDto.getPassword(),
                userRegisterDto.getRwPassword(),
                userRegisterDto.getLogStatus(),"/base/userRegister");
    }

    @PutMapping("/adminRegister")
    public Result adminRegister(@RequestBody AdminRegisterDto adminRegisterDto) throws IOException {
        return baseStencil.adminRegister(
                adminRegisterDto.getUsername(),
                adminRegisterDto.getPassword(),
                adminRegisterDto.getRwPassword(),
                adminRegisterDto.getRole(),
                adminRegisterDto.getLogStatus(), "/base/adminRegister");
    }

    @PutMapping("/deliveryRegister")
    public Result deliveryRegister(@RequestBody DeliveryRegisterDto deliveryRegisterDto) throws IOException {
        return baseStencil.deliveryRegister(
                deliveryRegisterDto.getUsername(),
                deliveryRegisterDto.getPhone(),
                deliveryRegisterDto.getFactoryId(),
                deliveryRegisterDto.getRole(),
                deliveryRegisterDto.getLogStatus(), "/base/adminRegister");
    }

}
