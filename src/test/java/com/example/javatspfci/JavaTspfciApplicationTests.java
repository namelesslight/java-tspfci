package com.example.javatspfci;

import com.example.javatspfci.code.service.LogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class JavaTspfciApplicationTests {

    @Resource
    private LogService logService;

    @Test
    void contextLoads() {
        logService.addLog("6a7661d629fd4b70b45251f6e873c29e","register");
    }

}
