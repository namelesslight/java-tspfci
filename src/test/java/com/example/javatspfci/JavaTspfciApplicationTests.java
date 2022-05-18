package com.example.javatspfci;

import com.example.javatspfci.code.entity.po.Default;
import com.example.javatspfci.code.entity.po.Store;
import com.example.javatspfci.code.entity.po.Tableware;
import com.example.javatspfci.code.entity.vo.AdminLoginMsg;
import com.example.javatspfci.code.mapper.DefaultMapper;
import com.example.javatspfci.code.mapper.TablewareMapper;
import com.example.javatspfci.code.service.AdminService;
import com.example.javatspfci.code.service.StoreService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class JavaTspfciApplicationTests {

    @Resource
    private DefaultMapper comboMapper;

    @Autowired
    private TablewareMapper tablewareMapper;

    @Test
    void contextLoads() {
//        List<Tableware> tablewares = tablewareMapper.listTablewareByFactory("xx厂",0, 1);
//        for (Tableware def : tablewares) {
//            System.out.println(def.toString());
//        }

//        Integer integer = comboMapper.addCombo("xx厂", "图片路径", BigDecimal.valueOf(11.11), "套餐1",
//                "一个碗", 10);
//        System.out.println(integer);

//        Integer integer = comboMapper.updateCombo(1,"xx厂", "图片路径", BigDecimal.valueOf(11.11), "套餐1",
//                "一个碗", 20);
//        System.out.println(integer);

//        Default def = comboMapper.selectComboById(1);
//        System.out.println(def.toString());

//        System.out.println(comboMapper.countCombo());
    }

    @Test
    void downloadFile() {

    }
}
