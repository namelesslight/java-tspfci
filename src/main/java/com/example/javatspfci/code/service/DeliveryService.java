package com.example.javatspfci.code.service;

import com.example.javatspfci.code.entity.po.Delivery;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.javatspfci.code.entity.vo.DeliverQueryMsg;
import com.example.javatspfci.code.entity.vo.DeliveryLoginMsg;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
public interface DeliveryService extends IService<Delivery> {

    /**
     * 添加配送员
     * @param id 配送员用户id
     * @param username 用户名
     * @param phone 电话号码
     * @return
     */
    public Boolean addDelivery(String id, String username, String phone);

    /**
     * 查询手机是否重复
     * @param phone 手机号码
     * @return
     */
    public Boolean queryCountByPhone(String phone);

    /**
     *
     * @param deUserName 配送员账号
     * @param password 密码
     * @return
     */
    public DeliveryLoginMsg deliveryLogin(String deUserName, String password);

    /**
     * 分页查询配送员
     * @param start 开始位置
     * @param count 查询人数
     * @return
     */
    public List<Delivery> listAllDeliverByPage(Integer start,Integer count);

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
    public DeliverQueryMsg getOneDeliveryByID(String delID);
}
