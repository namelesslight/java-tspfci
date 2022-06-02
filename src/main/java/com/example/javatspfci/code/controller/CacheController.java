package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.AddCacheDto;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.stencil.CacheStencil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author
 * @since 2022-06-02
 */
@RestController
@RequestMapping("/code/cache")
public class CacheController {

    @Resource
    private CacheStencil cacheStencil;

    @PostMapping("/addCache")
    public Result addCache(@RequestBody AddCacheDto addCacheDto){
        return  cacheStencil.addCache(
                addCacheDto.getStoreId(),
                addCacheDto.getTableWare(),
                addCacheDto.getCount(),
                "/code/cache/addCache");
    }

}
