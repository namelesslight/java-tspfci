package com.example.javatspfci.code.stencil.impl;

import com.example.javatspfci.code.entity.bean.PageBean;
import com.example.javatspfci.code.entity.po.Factory;
import com.example.javatspfci.code.entity.vo.FactoryQueryMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.FactoryService;
import com.example.javatspfci.code.stencil.FactoryStencil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FactoryStencilImpl implements FactoryStencil {

    @Resource
    private FactoryService factoryService;

    /**
     * 获取全部配送员
     * @param page 页数
     * @param count 查询数量
     * @param path url路径
     * @return
     */
    @Override
    public Result getAllFactoryByPage(Integer page, Integer count, String path) {
        Integer totalCount = factoryService.queryAllFactoryCount();
        Integer totalPage = PageBean.getTotalPage(count,totalCount);
        Integer start =(page - 1) * count;
        List<Factory> data = factoryService.listAllFactoryByPage(start, count);
        PageBean<Factory> factoryPages = new PageBean(totalCount, page, totalPage, count, data);
        Map<String,Object> message = new HashMap<>();
        message.put("data",factoryPages);
        return new Result().result200(message,path);
    }

    /**
     * 通过id获取单个配送员信息
     * @param delID 配送员ID
     * @param path url路径
     * @return
     */
    @Override
    public Result getOneFactoryByID(String delID, String path) {
        FactoryQueryMsg factoryQueryMsgs = factoryService.getOneFactoryByID(delID);
        Map<String,Object> message = new HashMap<>();
        message.put("data",factoryQueryMsgs);
        return new Result().result200(message,path);
    }
}
