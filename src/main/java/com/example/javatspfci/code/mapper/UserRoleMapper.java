package com.example.javatspfci.code.mapper;

import com.example.javatspfci.code.entity.po.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
@Mapper
@Repository
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * 添加用户权限
     * @param id 用户编号
     * @param role 用户权限
     * @return
     */
    public Integer addRole(String id, String role);

}
