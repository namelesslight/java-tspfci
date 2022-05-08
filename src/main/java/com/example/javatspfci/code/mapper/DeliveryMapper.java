package com.example.javatspfci.code.mapper;

import com.example.javatspfci.code.entity.po.Delivery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.javatspfci.code.entity.vo.DeliverQueryMsg;
import com.example.javatspfci.code.entity.vo.DeliveryLoginMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public Integer addDelivery(String id, String username, String phone,String factoryId);

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
    public DeliveryLoginMsg selectDeByUsername(String deUserName, String password);

    /**
     * 分页查询配送员
     * @param start 开始位置
     * @param count 查询人数
     * @return
     */
    public List<Delivery> listAllDeliverByPage(Integer start, Integer count);

    /**
     * 查询配送员人数
     * @return
     */
    public Integer queryAllDeliverCount();

    /**
     * 通过ID查询配送员
     * @param delID 配送员ID
     * @return
     */
    public Delivery getOneDeliveryByID(String delID);

    /**
     * 通过厂家ID获取配送员数量
     * @param factoryId 工厂ID
     * @return
     */
    public Integer queryDeliveryCountByFactoryId(String factoryId);

    /**
     * 通过工厂ID获取配送员
     * @param factoryId 工厂ID
     * @param page 页数
     * @param count 查询数据数量
     * @return
     */
    public List<Delivery> listDeliveryByFactoryId(String factoryId, Integer page, Integer count);
}
