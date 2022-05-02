package com.example.javatspfci;

import com.example.javatspfci.code.entity.vo.AdminMsg;
import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.entity.vo.FactoryMsg;
import com.example.javatspfci.code.service.FactoryService;
import com.example.javatspfci.code.service.LogService;
import com.example.javatspfci.code.service.impl.AdminServiceImpl;
import com.example.javatspfci.code.service.impl.DeliveryServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class JavaTspfciApplicationTests {

    @Resource
    private DeliveryServiceImpl deliveryService;

    @Test
    void contextLoads() {
        DeliveryMsg deliveryMsg = deliveryService.deliveryLogin("abc", "e10adc3949ba59abbe56e057f20f883e");
        System.out.println(deliveryMsg.toString());
    }

}
