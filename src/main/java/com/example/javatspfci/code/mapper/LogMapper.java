package com.example.javatspfci.code.mapper;

import com.example.javatspfci.code.entity.po.Log;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.javatspfci.code.entity.vo.LogMsg;
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
public interface LogMapper extends BaseMapper<Log> {

    /**
     * 添加记录
     * @param logUser 用户ID
     * @param logStatus 操作
     * @return
     */
    public Integer addLog(String logUser,String logStatus);

    /**
     * 分页查询店家信息
     * @param start 开始的下标
     * @param count 查询个数
     * @return
     */
    public List<LogMsg> queryUserMsgByPage(Integer start, Integer count);

    /**
     * 查询店家记录个数
     * @return
     */
    public Integer queryUserCount();

    /**
     * 分页查询厂家信息
     * @param start 开始的下标
     * @param count 查询个数
     * @return
     */
    public List<LogMsg> queryUserAdminMsgByPage(Integer start, Integer count);

    /**
     * 查询厂家记录个数
     * @return
     */
    public Integer queryUserAdminCount();

    /**
     * 分页查询配送员信息
     * @param start 开始的下标
     * @param count 查询个数
     * @return
     */
    public List<LogMsg> queryDeliverMsgByPage(Integer start, Integer count);

    /**
     * 查询配送员记录个数
     * @return
     */
    public Integer queryDeliverCount();

    /**
     * 分页查询管理员信息
     * @param start 开始的下标
     * @param count 查询个数
     * @return
     */
    public List<LogMsg> querySuperAdminMsgByPage(Integer start, Integer count);

    /**
     * 查询管理员记录个数
     * @return
     */
    public Integer querySuperAdminCount();
}
