package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.AllPassword;
import com.example.javatspfci.code.mapper.AllPasswordMapper;
import com.example.javatspfci.code.service.AllPasswordService;
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
public class AllPasswordServiceImpl extends ServiceImpl<AllPasswordMapper, AllPassword> implements AllPasswordService {

    @Resource
    private AllPasswordMapper allPasswordMapper;

    /**
     *
     * @param id 用户编号
     * @param password 用户密码
     * @return
     */
    @Override
    public Boolean addUser(String id, String password) {
        return allPasswordMapper.addUser(id, password) == 1;
    }

    /**
     * 修改密码
     * @param id 用户id
     * @param newPassword 新密码
     * @return
     */
    @Override
    public Boolean updatePassword(String id, String newPassword) {
        return allPasswordMapper.updatePassword(id, newPassword) == 1;
    }

    /**
     * 查看是否存在该用户
     * @param id 用户id
     * @param password 密码
     * @return
     */
    @Override
    public Boolean findCountByPassword(String id, String password) {
        return allPasswordMapper.findCountByPassword(id, password) == 1;
    }
}
