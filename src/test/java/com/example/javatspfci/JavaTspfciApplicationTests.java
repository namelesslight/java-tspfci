package com.example.javatspfci;

import com.example.javatspfci.code.entity.po.Store;
import com.example.javatspfci.code.entity.vo.AdminLoginMsg;
import com.example.javatspfci.code.service.AdminService;
import com.example.javatspfci.code.service.StoreService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class JavaTspfciApplicationTests {

    @Resource
    private StoreService storeService;

    @Test
    void contextLoads() {
//        List<Store> storeList = storeService.listAllStoreByPage(0, 1);
//        for (Store store : storeList) {
//            System.out.println(store.toString());
//        }
        System.out.println(storeService.queryAllStoreCount());
    }
}
