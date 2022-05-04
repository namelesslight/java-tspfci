package com.example.javatspfci.code.service;

import com.example.javatspfci.code.entity.po.Factory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.javatspfci.code.entity.vo.FactoryLoginMsg;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
public interface FactoryService extends IService<Factory> {

    /**
     *
     * @param id 厂家用户主键
     * @param username 用户名
     * @param phone 电话
     * @return
     */
    public Boolean addFactory(String id, String username, String phone);

    /**
     * 查询手机是否重复
     * @param phone 手机号码
     * @return
     */
    public Boolean queryCountByPhone(String phone);

    /**
     *
     * @param facUserName 厂家用户名
     * @param password 密码
     * @return
     */
    public FactoryLoginMsg factoryLogin(String facUserName, String password);
}
