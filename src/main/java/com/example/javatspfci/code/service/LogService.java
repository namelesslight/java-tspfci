package com.example.javatspfci.code.service;

import com.example.javatspfci.code.entity.po.Log;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2022-04-29
 */
public interface LogService extends IService<Log> {

    /**
     * 添加记录
     * @param logUser
     * @param logStatus
     * @return
     */
    public Boolean addLog(String logUser,String logStatus);

}
