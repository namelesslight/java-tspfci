package com.example.javatspfci.code.mapper;

import com.example.javatspfci.code.entity.po.Store;
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
public interface StoreMapper extends BaseMapper<Store> {

    /**
     *
     * @param id 店家用户主键
     * @param username 用户名
     * @param phone 电话
     * @return
     */
    public Integer addStore(String id, String username, String phone);

    /**
     * 查询手机是否重复
     * @param phone 手机号码
     * @return
     */
    public Integer queryCountByPhone(String phone);

}
