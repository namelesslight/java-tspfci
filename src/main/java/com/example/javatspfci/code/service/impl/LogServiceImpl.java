package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Log;
import com.example.javatspfci.code.entity.vo.LogMsg;
import com.example.javatspfci.code.mapper.LogMapper;
import com.example.javatspfci.code.service.LogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

    @Resource
    private LogMapper logMapper;

    /**
     * 添加记录
     * @param logUser 用户ID
     * @param logStatus 操作
     * @return
     */
    @Override
    public Boolean addLog(String logUser, String logStatus) {
        return logMapper.addLog(logUser, logStatus) == 1;
    }

    /**
     *
     * @param start 开始的下标
     * @param count 查询个数
     * @return
     */
    @Override
    public List<LogMsg> queryLogMsgByPage(String role, Integer start, Integer count) {
        List<LogMsg> data = null;
        if (role.equals("user")){
            data = logMapper.queryUserMsgByPage(start, count);
        } else if (role.equals("userAdmin")){
            data = logMapper.queryUserAdminMsgByPage(start, count);
        } else if (role.equals("delivery")){
            data = logMapper.queryDeliverMsgByPage(start, count);
        } else if (role.equals("superAdmin")){
            data = logMapper.querySuperAdminMsgByPage(start, count);
        }
        return data;
    }

    /**
     * 根据身份查询个数
     * @param role 身份
     * @return
     */
    @Override
    public Integer queryTotalCountByRole(String role) {
        int totalCount = 0;
        if (role.equals("user")){
            totalCount = logMapper.queryUserCount();
        } else if (role.equals("userAdmin")){
            totalCount = logMapper.queryUserAdminCount();
        } else if (role.equals("delivery")){
            totalCount = logMapper.queryDeliverCount();
        } else if (role.equals("superAdmin")){
            totalCount = logMapper.querySuperAdminCount();
        }
        return totalCount;
    }
}
