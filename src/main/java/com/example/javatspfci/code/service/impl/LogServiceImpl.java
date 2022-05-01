package com.example.javatspfci.code.service.impl;

import com.example.javatspfci.code.entity.po.Log;
import com.example.javatspfci.code.mapper.LogMapper;
import com.example.javatspfci.code.service.LogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

    @Resource
    private LogMapper logMapper;

    @Override
    public Boolean addLog(String logUser, String logStatus) {
        return logMapper.addLog(logUser, logStatus) == 1;
    }
}
