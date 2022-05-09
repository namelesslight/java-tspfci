package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.AdminRegisterDto;
import com.example.javatspfci.code.entity.dto.DeliveryRegisterDto;
import com.example.javatspfci.code.entity.dto.UpdatePasswordDto;
import com.example.javatspfci.code.entity.dto.UserRegisterDto;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.stencil.PasswordStencil;
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
    private PasswordStencil passwordStencil;

    /**
     * 用户注册
     * @param userRegisterDto 前端传入json接收类
     * @return
     */
    @PutMapping("/userRegister")
    public Result userRegister(@RequestBody UserRegisterDto userRegisterDto){
        return passwordStencil.userRegister(
                userRegisterDto.getUsername(),
                userRegisterDto.getPhone(),
                userRegisterDto.getRole(),
                userRegisterDto.getPassword(),
                userRegisterDto.getRwPassword(),
                userRegisterDto.getLogStatus(),"/base/userRegister");
    }

    /**
     * 管理员注册
     * @param adminRegisterDto 前端传入json接收类
     * @return
     * @throws IOException
     */
    @PutMapping("/adminRegister")
    public Result adminRegister(@RequestBody AdminRegisterDto adminRegisterDto) throws IOException {
        return passwordStencil.adminRegister(
                adminRegisterDto.getUsername(),
                adminRegisterDto.getPassword(),
                adminRegisterDto.getRwPassword(),
                adminRegisterDto.getRole(),
                adminRegisterDto.getLogStatus(), "/base/adminRegister");
    }

    /**
     * 配送员注册
     * @param deliveryRegisterDto 前端传入json接收类
     * @return
     * @throws IOException
     */
    @PutMapping("/deliveryRegister")
    public Result deliveryRegister(@RequestBody DeliveryRegisterDto deliveryRegisterDto) throws IOException {
        return passwordStencil.deliveryRegister(
                deliveryRegisterDto.getUsername(),
                deliveryRegisterDto.getPhone(),
                deliveryRegisterDto.getFactoryId(),
                deliveryRegisterDto.getRole(),
                deliveryRegisterDto.getLogStatus(), "/base/adminRegister");
    }

    /**
     * 修改密码
     * @param updatePasswordDto 前端传入json接收类
     * @return
     */
        @PostMapping("/updatePassword")
    public Result updatePassword(@RequestBody UpdatePasswordDto updatePasswordDto){
        return passwordStencil.updatePassword(
                updatePasswordDto.getId(),
                updatePasswordDto.getOldPassword(),
                updatePasswordDto.getNewPassword(),
                updatePasswordDto.getRwPassword(), "/base/updatePassword");
    }

}
