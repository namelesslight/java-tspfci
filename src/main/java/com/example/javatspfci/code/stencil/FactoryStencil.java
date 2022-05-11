package com.example.javatspfci.code.stencil;

import com.example.javatspfci.code.result.Result;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FactoryStencil {

    /**
     * 分页获取全部厂家
     * @param page 页数
     * @param count 查询数量
     * @param path url路径
     * @return
     */
    public Result getAllFactoryByPage(Integer page, Integer count, String path);

    /**
     * 通过id获取单个厂家信息
     * @param delID 配送员ID
     * @param path url路径
     * @return
     */
    public Result getOneFactoryByID(String delID, String path);

    /**
     * 修改厂家
     * @param id 厂家id
     * @param username 用户名
     * @param factoryName 厂家名
     * @param introduce 厂家介绍
     * @param headPicture 厂家图片
     * @param location 厂家地址
     * @param factoryLicence 经营许可证
     * @param path url路径
     * @return
     */
    public Result updateFactory(String id, String username, String factoryName, String introduce, MultipartFile headPicture,
                                String location, MultipartFile factoryLicence, String path) throws IOException;
}
