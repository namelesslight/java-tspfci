package com.example.javatspfci.code.service;

import com.example.javatspfci.code.entity.po.Log;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.javatspfci.code.entity.vo.LogMsg;

import java.util.List;

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
     * @param logUser 用户ID
     * @param logStatus 操作
     * @return
     */
    public Boolean addLog(String logUser,String logStatus);

    /**
     * 分页查询用户信息
     * @param role 查询的身份
     * @param start 开始的下标
     * @param count 查询个数
     * @return
     */
    public List<LogMsg> queryLogMsgByPage(String role, Integer start, Integer count);

    /**
     * 根据查询记录个数
     * @param role 身份
     * @return
     */
    public Integer queryTotalCountByRole(String role);

}
