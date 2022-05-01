package com.example.javatspfci.code.mapper;

import com.example.javatspfci.code.entity.po.Log;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface LogMapper extends BaseMapper<Log> {

    /**
     * 添加记录
     * @param logUser
     * @param logStatus
     * @return
     */
    public Integer addLog(String logUser,String logStatus);

}
