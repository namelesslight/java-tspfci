package com.example.javatspfci.code.mapper;

import com.example.javatspfci.code.entity.po.Delivery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.javatspfci.code.entity.vo.DeliveryMsg;
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
public interface DeliveryMapper extends BaseMapper<Delivery> {

    /**
     * 添加配送员
     * @param id 配送员用户id
     * @param username 用户名
     * @param phone 电话号码
     * @return
     */
    public Integer addDelivery(String id, String username, String phone);

    /**
     * 查询手机是否重复
     * @param phone 手机号码
     * @return
     */
    public Integer queryCountByPhone(String phone);

    /**
     *
     * @param deUserName 配送员用户名
     * @param password 密码
     * @return
     */
    public DeliveryMsg selectDeByUsername(String deUserName, String password);
}
