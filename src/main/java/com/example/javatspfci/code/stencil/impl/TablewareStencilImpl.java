package com.example.javatspfci.code.stencil.impl;

import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.stencil.TablewareStencil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class TablewareStencilImpl implements TablewareStencil {

    /**
     * 添加餐具
     * @param factoryId 餐具所属厂家ID
     * @param name 餐具名
     * @param describe 餐具描述
     * @param type 餐具类型
     * @param picture 餐具图片
     * @param price 餐具具价格
     * @param stock 餐具库存
     * @param path url路径
     * @return
     */
    @Override
    public Result addTableware(String factoryId, String name, String describe, String type, MultipartFile picture,
                               Double price, Integer stock, String path) {
        //根据餐具类型来设置置权值
        int value = 0;
        if ("Chopsticks".equals(type)){
            value = 0;
        } else if ("Plate".equals(type)){
            value = 18;
        } else if ("Cup".equals(type)){
            value = 19;
        } else if ("Bowl".equals(type)){
            value = 20;
        } else if ("Scoop".equals(type)){
            value = 21;
        } else if ("Dish".equals(type)){
            value = 22;
        }

        return null;
    }

    /**
     * 根据工厂编号查询所有餐具
     * @param factoryId 工厂ID
     * @param path url路径
     * @return
     */
    @Override
    public Result listTablewareByFactory(String factoryId, String path) {
        return null;
    }

    /**
     * 根据id获取单个餐具详情
     * @param id 餐具ID
     * @return
     */
    @Override
    public Result queryOneTablewareById(Integer id) {
        return null;
    }

    /**
     * 更改餐具信息
     * @param id 餐具所属厂家ID
     * @param name 餐具名
     * @param describe 餐具描述
     * @param type 餐具类型
     * @param picture 餐具图片
     * @param price 餐具具价格
     * @param stock 餐具库存
     * @param path url路径
     * @return
     */
    @Override
    public Result updateTableware(Integer id, String name, String describe, String type, MultipartFile picture,
                                  Double price, Integer stock, String path) {
        return null;
    }
}
