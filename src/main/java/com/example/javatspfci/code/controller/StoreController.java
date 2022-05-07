package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.StoreLoginDto;
import com.example.javatspfci.code.entity.vo.StoreLoginMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.StoreService;
import com.example.javatspfci.code.stencil.LoginStencil;
import com.example.javatspfci.code.stencil.StoreStencil;
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
@RequestMapping("/code/store")
public class StoreController {
    @Autowired
    private LoginStencil loginStencil;

    @Autowired
    private StoreService storeService;

    @Autowired
    private StoreStencil storeStencil;

    @PostMapping("/login")
    public Result storeLogin(@RequestBody StoreLoginDto storeLoginDto, @RequestHeader(value = "token", required = false) String token) {
        //md5加密
        String md5Password = SecretUtil.secretString(storeLoginDto.getPassword());
        //查询用户是否存在
        StoreLoginMsg storeMsg = null;
        try {
            storeMsg = storeService.storeLogin(storeLoginDto.getStUserName(), md5Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取Result
        Result result = loginStencil.storeLogin(storeMsg, "login", "/code/store/login", token);

        return result;
    }

    /**
     * 根据id获取店家信息
     * @param id 店家id
     * @return
     */
    @GetMapping("/getStoreInformation")
    public Result getStoreInformation(@RequestParam String id){
        Result result = storeStencil.getOneStoreById(id, "/code/store/getStoreInformation");
        return result;
    }

    /**
     * 分页查询店家
     * @param page 页数
     * @param count 查询数量
     * @return
     */
    @GetMapping("/getAllStoreByPage")
    public Result getAllStoreByPage(@RequestParam Integer page,
                                    @RequestParam Integer count){
        return storeStencil.getAllStoreByPage(page,count,"/code/store/getAllStoreByPage");
    }

}
