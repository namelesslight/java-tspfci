package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Tableware;
import com.example.javatspfci.code.mapper.TablewareMapper;
import com.example.javatspfci.code.service.TablewareService;
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
 * @author Katechian
 * @since 2022-05-11
 */
@Service
public class TablewareServiceImpl extends ServiceImpl<TablewareMapper, Tableware> implements TablewareService {

    @Autowired
    private TablewareMapper tablewareMapper;

    @Override
    public Integer addTableware(String factory, String name, String describe, String type, String picture,
                                   String size, BigDecimal price, int stock, int value) {
        return tablewareMapper.addTableware(factory, name, describe, type, picture, size, price, stock, value);
    }

    @Override
    public Integer updateTableware(int id, String factory, String name, String describe, String picture, String size, BigDecimal price, int stock) {
        return tablewareMapper.updateTableware(id, factory, name, describe, picture, size, price, stock);
    }

    @Override
    public Tableware selectTablewareById(int id) {
        return tablewareMapper.selectTablewareById(id);
    }

    @Override
    public List<Tableware> listAllTablewareByPage(Integer start, Integer count) {
        return tablewareMapper.listAllTablewareByPage(start, count);
    }

    @Override
    public Integer countTableware() {
        return tablewareMapper.countTableware();
    }

    @Override
    public Integer countTablewareByFactoryId(String factoryId) {
        return tablewareMapper.countTablewareByFactoryId(factoryId);
    }

    @Override
    public List<Tableware> listTablewareByFactory(String facName, Integer start, Integer count) {
        return tablewareMapper.listTablewareByFactory(facName, start, count);
    }
}
