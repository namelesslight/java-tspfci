package com.example.javatspfci.code.service;

import com.example.javatspfci.code.entity.po.Store;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.javatspfci.code.entity.vo.StoreLoginMsg;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
public interface StoreService extends IService<Store> {
    /**
     *
     * @param id 店家用户主键
     * @param username 用户名
     * @param phone 电话
     * @return
     */
    public Boolean addStore(String id, String username, String phone);

    /**
     * 查询手机是否重复
     * @param phone 手机号码
     * @return
     */
    public Boolean queryCountByPhone(String phone);

    /**
     * 店家登录
     * @param stUsername 店家用户名
     * @param password 密码
     * @return
     */
    public StoreLoginMsg storeLogin(String stUsername, String password);
}
