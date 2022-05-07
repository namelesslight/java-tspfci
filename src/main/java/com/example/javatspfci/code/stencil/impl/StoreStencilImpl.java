package com.example.javatspfci.code.stencil.impl;

import com.example.javatspfci.code.entity.bean.PageBean;
import com.example.javatspfci.code.entity.po.Delivery;
import com.example.javatspfci.code.entity.po.Store;
import com.example.javatspfci.code.entity.vo.StoreLoginMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.StoreService;
import com.example.javatspfci.code.stencil.StoreStencil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/5/4 20:38
 */
@Service
public class StoreStencilImpl implements StoreStencil {
    @Autowired
    private StoreService storeService;
    @Override
    public Result getOneStoreById(String id, String path) {
        StoreLoginMsg storeMsg = null;
        Map<String,Object> message = new HashMap<>();

        try {
             storeMsg = storeService.queryStoreById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (storeMsg == null){
            message.put("data", "查无此人");
        } else {
            message.put("data", storeMsg);
        }
        return new Result().result200(message, path);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result getAllStoreByPage(Integer page, Integer count, String path) {
        Map<String,Object> message = new HashMap<>();
        if (page < 1 || count <= 0) {
            message.put("data", "参数错误");
            return new Result().result200(message, path);
        } else {
            //获取总记录数
            Integer totalCount = null;
            try {
                totalCount = storeService.queryAllStoreCount();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //获取总页数
            Integer totalPage = PageBean.getTotalPage(count, totalCount);
            //获取偏移量
            Integer start = (page - 1) * count;
            //获取数据
            List<Store> data = null;
            try {
                data = storeService.listAllStoreByPage(start, count);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //封装到PageBean
            PageBean<Store> storePages = new PageBean<>(totalCount, page, totalPage, count, data);
            message.put("data", storePages);
            return new Result().result200(message, path);
        }
    }
}
