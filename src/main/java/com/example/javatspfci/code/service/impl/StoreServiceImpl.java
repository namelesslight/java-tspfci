package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Store;
import com.example.javatspfci.code.entity.vo.StoreLoginMsg;
import com.example.javatspfci.code.mapper.StoreMapper;
import com.example.javatspfci.code.service.StoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements StoreService {

    @Resource
    private  StoreMapper storeMapper;

    /**
     * 添加店家
     * @param id 店家用户主键
     * @param username 用户名
     * @param phone 电话
     * @return
     */
    @Override
    public Boolean addStore(String id, String username, String phone) {
        return storeMapper.addStore(id, username, phone) == 1;
    }

    /**
     *
     * @param phone 手机号码
     * @return
     */
    @Override
    public Boolean queryCountByPhone(String phone) {
        return storeMapper.queryCountByPhone(phone) == 1;
    }

    /**
     *
     * @param stUsername 店家用户名
     * @param password 密码
     * @return
     */
    @Override
    public StoreLoginMsg storeLogin(String stUsername, String password) {
        return storeMapper.selectStoreByUsername(stUsername, password);
    }

    /**
     * 根据id查询店家信息
     * @param id
     * @return
     */
    @Override
    public StoreLoginMsg queryStoreById(String id) {
        return storeMapper.selectStoreUserById(id);
    }

    /**
     * 分页查询店家信息
     * @param start 开始位置
     * @param count 查询个数
     * @return
     */
    @Override
    public List<Store> listAllStoreByPage(Integer start, Integer count) {
        return storeMapper.listAllStoreByPage(start, count);
    }

    /**
     * 查询店家数
     * @return
     */
    @Override
    public Integer queryAllStoreCount() {
        return storeMapper.queryAllStoreCount();
    }

}
