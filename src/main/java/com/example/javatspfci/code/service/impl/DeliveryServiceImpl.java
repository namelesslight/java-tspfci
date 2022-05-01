package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Delivery;
import com.example.javatspfci.code.entity.vo.DeliveryMsg;
import com.example.javatspfci.code.mapper.DeliveryMapper;
import com.example.javatspfci.code.service.DeliveryService;
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
public class DeliveryServiceImpl extends ServiceImpl<DeliveryMapper, Delivery> implements DeliveryService {

    @Resource
    private DeliveryMapper deliveryMapper;

    /**
     * 添加配送员
     * @param id 配送员用户id
     * @param username 用户名
     * @param phone 电话号码
     * @return
     */
    @Override
    public Boolean addDelivery(String id, String username, String phone) {
        return deliveryMapper.addDelivery(id, username, phone) == 1;
    }

    @Override
    public Boolean queryCountByPhone(String phone) {
        return deliveryMapper.queryCountByPhone(phone) == 1;
    }

    /**
     *
     * @param deUserName 配送员账号
     * @param password 密码
     * @return
     */
    @Override
    public DeliveryMsg deliveryLogin(String deUserName, String password) {
        return deliveryMapper.selectDeByUsername(deUserName, password);
    }
}
