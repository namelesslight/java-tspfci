package com.example.javatspfci.code.stencil.impl;

import com.example.javatspfci.code.entity.bean.PageBean;
import com.example.javatspfci.code.entity.po.Default;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.DefaultService;
import com.example.javatspfci.code.stencil.DefaultStencil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author: Katechian
 * @CreateTime: 2022/5/17 22:38
 */

@Service
public class ComboStencilImpl implements DefaultStencil {
    @Autowired
    private DefaultService ComboService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addCombo(String factoryId, String picture, BigDecimal price, String name, String info, int stock, String path) {
        Map<String, Object> message = new HashMap<>();
        try {
            ComboService.addCombo(factoryId, picture, price, name, info, stock);
            message.put("data", "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            message.put("data", "添加失败");
        }
        return new Result().result200(message, path);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result updateCombo(int id, String factoryId, String picture, BigDecimal price, String name, String info, int stock, String path) {
        Map<String, Object> message = new HashMap<>();
        try {
            ComboService.updateCombo(id, factoryId, picture, price, name, info, stock);
            message.put("data", "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            message.put("data", "修改失败");
        }
        return new Result().result200(message, path);
    }

    @Override
    public Result selectComboById(int id, String path) {
        Map<String, Object> message = new HashMap<>();
        try {
            Default combo = ComboService.selectComboById(id);
            message.put("data", combo);
        } catch (Exception e) {
            e.printStackTrace();
            message.put("data", "查询失败");
        }
        return new Result().result200(message, path);
    }

    @Override
    public Result countCombo(String path) {
        Map<String, Object> message = new HashMap<>();
        try {
            Integer count = ComboService.countCombo();
            message.put("data", count);
        } catch (Exception e) {
            e.printStackTrace();
            message.put("data", "查询失败");
        }
        return new Result().result200(message, path);
    }

    @Override
    public Result countComboByFactoryId(String factoryId, String path) {
        Map<String, Object> message = new HashMap<>();
        try {
            Integer count = ComboService.countComboByFactoryId(factoryId);
            message.put("data", count);
        } catch (Exception e) {
            e.printStackTrace();
            message.put("data", "查询失败");
        }
        return new Result().result200(message, path);
    }

    @Override
    public Result listAllComboByPage(Integer page, Integer count, String path) {
        Map<String,Object> message = new HashMap<>();
        if (page < 1 || count <= 0) {
            message.put("data", "参数错误");
            return new Result().result200(message, path);
        } else {
            //获取总记录数
            Integer totalCount = null;
            try {
                totalCount = ComboService.countCombo();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //获取总页数
            Integer totalPage = PageBean.getTotalPage(count, totalCount);
            //获取偏移量
            Integer start = (page - 1) * count;
            //获取数据
            List<Default> data = null;
            try {
                data = ComboService.listAllComboByPage(start, count);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //封装到PageBean
            PageBean<Default> comboPages = new PageBean<>(totalCount, page, totalPage, count, data);
            message.put("data", comboPages);
            return new Result().result200(message, path);
        }
    }

    @Override
    public Result listComboByFactory(String factoryId, Integer page, Integer count, String path) {
        Map<String,Object> message = new HashMap<>();
        if (page < 1 || count <= 0) {
            message.put("data", "参数错误");
            return new Result().result200(message, path);
        } else {
            //获取总记录数
            Integer totalCount = null;
            try {
                totalCount = ComboService.countComboByFactoryId(factoryId);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //获取总页数
            Integer totalPage = PageBean.getTotalPage(count, totalCount);
            //获取偏移量
            Integer start = (page - 1) * count;
            //获取数据
            List<Default> data = null;
            try {
                data = ComboService.listComboByFactory(factoryId, start, count);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //封装到PageBean
            PageBean<Default> comboPages = new PageBean<>(totalCount, page, totalPage, count, data);
            message.put("data", comboPages);
            return new Result().result200(message, path);
        }
    }

    @Override
    public Result deleteCombo(Integer id, String path) {
        Map<String, Object> message = new HashMap<>();
        try {
            ComboService.deleteCombo(id);
            message.put("data", "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            message.put("data", "删除失败");
        }
        return new Result().result200(message, path);
    }
}
