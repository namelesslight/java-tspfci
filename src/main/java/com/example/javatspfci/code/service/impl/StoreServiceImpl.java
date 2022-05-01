package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Store;
import com.example.javatspfci.code.mapper.StoreMapper;
import com.example.javatspfci.code.service.StoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements StoreService {

    @Resource
    private  StoreMapper storeMapper;

    /**
     * 添加店家
     * @param id 店家用户主键
     * @param username 用户名
     * @param phone 电话
     * @return
     */
    @Override
    public Boolean addStore(String id, String username, String phone) {
        return storeMapper.addStore(id, username, phone) == 1;
    }

    @Override
    public Boolean queryCountByPhone(String phone) {
        return storeMapper.queryCountByPhone(phone) == 1;
    }
}
