package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Default;
import com.example.javatspfci.code.mapper.DefaultMapper;
import com.example.javatspfci.code.service.DefaultService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZCL
 * @since 2022-05-11
 */
@Service
public class DefaultServiceImpl extends ServiceImpl<DefaultMapper, Default> implements DefaultService {
    @Autowired
    private DefaultMapper defaultMapper;

    @Override
    public Integer addCombo(String factory, String picture, BigDecimal price, String name, String info, int stock) {
        return defaultMapper.addCombo(factory, picture, price, name, info, stock);
    }

    @Override
    public Integer updateCombo(int id, String factory, String picture, BigDecimal price, String name, String info, int stock) {
        return defaultMapper.updateCombo(id, factory, picture, price, name, info, stock);
    }

    @Override
    public Default selectComboById(int id) {
        return defaultMapper.selectComboById(id);
    }

    @Override
    public List<Default> listAllComboByPage(Integer start, Integer count) {
        return defaultMapper.listAllComboByPage(start, count);
    }

    @Override
    public Integer countCombo() {
        return defaultMapper.countCombo();
    }

    @Override
    public Integer countComboByFactoryId(String factoryId) {
        return defaultMapper.countComboByFactoryId(factoryId);
    }

    @Override
    public List<Default> listComboByFactory(String facName, Integer start, Integer count) {
        return defaultMapper.listComboByFactory(facName, start, count);
    }

    @Override
    public Integer deleteCombo(Integer id) {
        return defaultMapper.deleteCombo(id);
    }


}
