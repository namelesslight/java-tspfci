package com.example.javatspfci.code.mapper;

import com.example.javatspfci.code.entity.po.AllPassword;
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
public interface AllPasswordMapper extends BaseMapper<AllPassword> {

    /**
     * 添加用户
     * @param id 用户id
     * @param password 密码
     * @return
     */
    public Integer addUser(String id,String password);

    /**
     * 查看是否存在该用户
     * @param id 用户id
     * @param password 密码
     * @return
     */
    public Integer findCountByPassword(String id, String password);

    /**
     * 修改密码
     * @param id 用户id
     * @param newPassword 新密码
     * @return
     */
    public Integer updatePassword(String id, String newPassword);

}
