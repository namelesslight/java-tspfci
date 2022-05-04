package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Factory;
import com.example.javatspfci.code.entity.vo.DeliverQueryMsg;
import com.example.javatspfci.code.entity.vo.FactoryLoginMsg;
import com.example.javatspfci.code.entity.vo.FactoryQueryMsg;
import com.example.javatspfci.code.mapper.FactoryMapper;
import com.example.javatspfci.code.service.FactoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
@Service
public class FactoryServiceImpl extends ServiceImpl<FactoryMapper, Factory> implements FactoryService {

    @Resource
    private FactoryMapper factoryMapper;

    /**
     * 添加厂家
     * @param id 厂家用户主键
     * @param username 用户名
     * @param phone 电话
     * @return
     */
    @Override
    public Boolean addFactory(String id, String username, String phone) {
        return factoryMapper.addFactory(id, username, phone) == 1;
    }

    @Override
    public Boolean queryCountByPhone(String phone) {
        return factoryMapper.queryCountByPhone(phone) == 1;
    }

    /**
     * 厂家登录
     * @param facUserName 厂家用户名
     * @param password 密码
     * @return
     */
    @Override
    public FactoryLoginMsg factoryLogin(String facUserName, String password) {
        return factoryMapper.selectFacUserName(facUserName, password);
    }

    /**
     * 分页查询所有厂家
     * @param start 开始位置
     * @param count 查询人数
     * @return
     */
    @Override
    public List<Factory> listAllFactoryByPage(Integer start, Integer count) {
        return factoryMapper.listAllFactoryByPage(start, count);
    }

    /**
     * 查询所有厂家个数
     * @return
     */
    @Override
    public Integer queryAllFactoryCount() {
        return factoryMapper.queryAllFactoryCount();
    }

    /**
     * 查询单个厂家
     * @param delID 配送员ID
     * @return
     */
    @Override
    public FactoryQueryMsg getOneFactoryByID(String delID) {
        return factoryMapper.getOneFactoryByID(delID);
    }

}
