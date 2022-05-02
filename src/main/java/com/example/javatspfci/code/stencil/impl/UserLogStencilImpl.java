package com.example.javatspfci.code.stencil.impl;


import com.example.javatspfci.code.entity.bean.PageBean;
import com.example.javatspfci.code.entity.vo.LogMsg;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.service.LogService;
import com.example.javatspfci.code.stencil.UserLogStencil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserLogStencilImpl implements UserLogStencil {

    @Resource
    private LogService logService;

    /**
     * 分页获取记录
     * @param role 权限
     * @param page 查询页数
     * @param count 查询个数
     * @param path url路径
     * @return
     */
    @Override
    public Result queryUserLogByPage(String role,Integer page, Integer count,String path) {
        Integer totalCount = logService.queryTotalCountByRole(role);
        Integer totalPage = PageBean.getTotalPage(count,totalCount);
        Integer start =(page - 1) * count;
        List<LogMsg> data = logService.queryLogMsgByPage(role, start, count);
        PageBean<LogMsg> logMsgPages = new PageBean<>(totalCount, page, totalPage, start, data);
        Map<String,Object> message = new HashMap<>();
        message.put("pages",logMsgPages);
        return new Result().result200(message,path);
    }
}
