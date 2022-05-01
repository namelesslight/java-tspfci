package com.example.javatspfci.code.service;

import com.example.javatspfci.code.entity.po.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
public interface UserRoleService extends IService<UserRole> {

    /**
     * 添加权限
     * @param id 用户id
     * @param role 用户权限
     * @return
     */
    public Boolean addRole(String id,String role);

}
