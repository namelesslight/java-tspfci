package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.DeLoginDto;
import com.example.javatspfci.code.entity.vo.DeliveryLoginMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.DeliveryService;
import com.example.javatspfci.code.stencil.DeliveryStencil;
import com.example.javatspfci.code.stencil.LoginStencil;
import com.example.javatspfci.code.util.SecretUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
@RequestMapping("/code/delivery")
public class DeliveryController {

    @Autowired
    private LoginStencil loginStencil;

    @Autowired
    private DeliveryService deliveryService;

    @Resource
    private DeliveryStencil deliveryStencil;

    @PostMapping("/login")
    public Result deliveryLogin(@RequestBody DeLoginDto deLoginDto, @RequestHeader(value = "token",required = false) String token) {
        //md5加密
        String md5Password = SecretUtil.secretString(deLoginDto.getPassword());
        //查询用户是否存在
        DeliveryLoginMsg deliveryMsg = null;
        try {
            deliveryMsg = deliveryService.deliveryLogin(deLoginDto.getDeUserName(), md5Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取Result
        Result result = loginStencil.deliveryLogin(deliveryMsg, "login", "/code/delivery/login", token);
        return result;
    }

    /**
     * 查询
     * @param page 页数
     * @param count 查询数量
     * @return
     */
    @GetMapping("/getAllDeliveryByPage")
    public Result getAllDeliveryByPage(@RequestParam Integer page,
                                       @RequestParam Integer count){
        return deliveryStencil.getAllDeliveryByPage(page,count,"/code/delivery/getAllDeliveryByPage");
    }

    /**
     * 通过厂家ID查询配送员
     * @param factory 工厂id
     * @param page 页数
     * @param count 查询数据个数
     * @return
     */
    @GetMapping("/listDeliveryByFactory")
    public  Result listDeliveryByFactory(@RequestParam String factory,
                                         @RequestParam Integer page,
                                         @RequestParam Integer count){
        return deliveryStencil.listDeliveryByFactory(factory, page, count, "/code/delivery/listDeliveryByFactory");
    }

    /**
     * 通过id查询配送员
     * @param id 配送员id
     * @return
     */
    @GetMapping("/getOneDeliveryByID")
    public Result getOneDeliveryByID(@RequestParam String id){
        return deliveryStencil.getOneDeliveryByID(id,"/code/delivery/getOneDeliveryByID");
    }

    @PostMapping("/updateDeliveryInfo")
    public Result updateDeliveryInfo(@RequestParam String id,
                                     @RequestParam String username,
                                     @RequestParam MultipartFile headPicture,
                                     @RequestParam MultipartFile drivingLicence,
                                     @RequestParam MultipartFile carLicence,
                                     @RequestParam MultipartFile carCode) throws IOException {
        return deliveryStencil.updateDeliveryInfo(id, username, headPicture, drivingLicence, carLicence,carCode,
                "/code/delivery/updateDeliveryInfo");
    }
}
