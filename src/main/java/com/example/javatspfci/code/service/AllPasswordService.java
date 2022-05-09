package com.example.javatspfci.code.service;

import com.example.javatspfci.code.entity.po.AllPassword;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
public interface AllPasswordService extends IService<AllPassword> {

    /**
     * 添加用户
     * @param id 用户编号
     * @param password 用户密码
     * @return
     */
    public Boolean addUser(String id, String password);

    /**
     * 修改密码
     * @param id 用户id
     * @param newPassword 新密码
     * @return
     */
    public Boolean updatePassword(String id, String newPassword);

    /**
     * 查看是否存在该用户
     * @param id 用户id
     * @param password 密码
     * @return
     */
    public Boolean findCountByPassword(String id, String password);
}
