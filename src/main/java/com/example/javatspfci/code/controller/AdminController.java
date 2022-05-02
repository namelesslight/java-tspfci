package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.AdminDto;
import com.example.javatspfci.code.entity.dto.DeLoginDto;
import com.example.javatspfci.code.entity.vo.AdminMsg;
import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.AdminService;
import com.example.javatspfci.code.service.DeliveryService;
import com.example.javatspfci.code.stencil.LoginStencil;
import com.example.javatspfci.code.util.SecretUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
@RestController
@RequestMapping("/code/admin")
public class AdminController {
    @Autowired
    private LoginStencil loginStencil;
    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public Result deliveryLogin(@RequestBody AdminDto adminDto, @RequestHeader(value = "token",required = false) String token) {
        //md5加密
        String md5Password = SecretUtil.secretString(adminDto.getPassword());
        //查询用户是否存在
        AdminMsg adminMsg = null;
        try {
             adminMsg = adminService.selectAdminUserByUsername(adminDto.getAdminUsername(), md5Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取Result
        Result result = loginStencil.adminLogin(adminMsg, "login", "/code/factory/login", token);
        return result;
    }
}
