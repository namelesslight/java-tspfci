package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.DeLoginDto;
import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.impl.DeliveryServiceImpl;
import com.example.javatspfci.code.stencil.impl.BaseStencilImpl;
import com.example.javatspfci.code.util.SecretUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
@RequestMapping("/code/delivery")
public class DeliveryController {
    @Autowired
    private BaseStencilImpl baseStencil;

    @Autowired
    private DeliveryServiceImpl deliveryService;

    @PostMapping("/login")
    @Transactional
    public Result deliveryLogin(@RequestBody DeLoginDto deLoginDto, @RequestHeader("token") String token) {
        //md5加密
        String md5Password = SecretUtil.secretString(deLoginDto.getAllPassword());
        //查询用户是否存在
        DeliveryMsg deliveryMsg = null;
        try {
            deliveryMsg = deliveryService.deliveryLogin(deLoginDto.getDeUserName(), md5Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取Result
        Result result = baseStencil.deliveryLogin(deliveryMsg, "login", "/code/factory/login", token);

        return result;
    }
}
