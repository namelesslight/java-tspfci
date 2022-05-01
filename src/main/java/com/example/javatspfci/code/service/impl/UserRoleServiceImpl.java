package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.UserRole;
import com.example.javatspfci.code.mapper.UserRoleMapper;
import com.example.javatspfci.code.service.UserRoleService;
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
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public Boolean addRole(String id, String role) {
        return userRoleMapper.addRole(id, role) == 1;
    }
}
