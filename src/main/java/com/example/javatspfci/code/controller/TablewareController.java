package com.example.javatspfci.code.controller;


import com.example.javatspfci.code.entity.dto.tableware.TablewareConditionDto;
import com.example.javatspfci.code.entity.dto.tableware.TablewareDto;
import com.example.javatspfci.code.entity.dto.tableware.TablewareTypeDto;
import com.example.javatspfci.code.result.Result;
import com.example.javatspfci.code.stencil.TablewareStencil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Katechian
 * @since 2022-05-11
 */
@RestController
@RequestMapping("/code/tableware")
public class TablewareController {
    @Autowired
    private TablewareStencil tablewareStencil;

    /**
     * 添加餐具
     *
     * @param tablewareDto 餐具接收类
     * @return
     */
    @PostMapping("/addTableware")
    public Result addTableware(@RequestBody TablewareDto tablewareDto) {
        Result result = tablewareStencil.addTableware(
                tablewareDto.getTabFactoryId(),
                tablewareDto.getTabName(),
                tablewareDto.getTabDescribe(),
                tablewareDto.getTabType(),
                tablewareDto.getTabPicture(),
                tablewareDto.getTabSize(),
                tablewareDto.getTabPrice(),
                tablewareDto.getTabStock(),
                "/code/tableware/addTableware"
        );
        return result;
    }

    /**
     * 修改餐具
     *
     * @param tablewareDto 餐具接收类
     * @return
     */
    @PostMapping("/updateTableware")
    public Result updateTableware(@RequestBody TablewareDto tablewareDto) {
        Result result = tablewareStencil.updateTableware(
                tablewareDto.getTabId(),
                tablewareDto.getTabFactoryId(),
                tablewareDto.getTabName(),
                tablewareDto.getTabDescribe(),
                tablewareDto.getTabPicture(),
                tablewareDto.getTabSize(),
                tablewareDto.getTabPrice(),
                tablewareDto.getTabStock(),
                "/code/tableware/updateTableware"
        );
        return result;
    }

    /**
     * 根据id查询餐具
     *
     * @param id 餐具id
     * @return
     */
    @GetMapping("/getTableware")
    public Result getTableware(@RequestParam Integer id) {
        Result result = tablewareStencil.selectTablewareById(id, "/code/tableware/getTableware");
        return result;
    }

    /**
     * 分页查询所有餐具
     *
     * @param page  开始页数
     * @param count 查多少个
     * @return
     */
    @GetMapping("/getAllTableware")
    public Result getAllTableware(@RequestParam Integer page,
                                  @RequestParam Integer count) {
        Result result = tablewareStencil.listAllTablewareByPage(page, count, "/code/tableware/getAllTableware");
        return result;
    }

    /**
     * 根据厂家id查询餐具
     *
     * @param factoryId 厂家id
     * @param page      开始页数
     * @param count     查多少个
     * @return
     */
    @GetMapping("/getTablewareByFactory")
    public Result getAllTablewareByFactory(@RequestParam String factoryId,
                                           @RequestParam Integer page,
                                           @RequestParam Integer count) {
        Result result =
                tablewareStencil.listTablewareByFactory(factoryId, page, count, "/code/tableware/getTablewareByFactory");
        return result;
    }

    /**
     * 餐具逻辑删除
     *
     * @param id 餐具id
     * @return
     */
    @PostMapping("/deleteTableware")
    public Result deleteTableware(@RequestParam Integer id) {
        Result result = tablewareStencil.deleteTableware(id, "/code/tableware/deleteTableware");
        return result;
    }

    /**
     * 根据类型分页查询餐具
     *
     * @param tablewareDto 餐具接收类
     * @return
     */
    @PostMapping("/getTablewareByType")
    public Result getTablewareByType(@RequestBody TablewareTypeDto tablewareDto) {
        Result result =
                tablewareStencil.listTablewareByType(
                        tablewareDto.getTabType(),
                        tablewareDto.getPage(),
                        tablewareDto.getCount(),
                        "/code/tableware/getTablewareByType");
        return result;
    }

    /**
     * 根据类型和工厂id分页查询餐具
     *
     * @param tablewareDto 餐具接收类
     * @return
     */
    @PostMapping("/getTablewareByCondition")
    public Result getTablewareByCondition(@RequestBody TablewareConditionDto tablewareDto) {
        Result result =
                tablewareStencil.listTablewareByCondition(
                        tablewareDto.getTabFactoryId(),
                        tablewareDto.getTabType(),
                        tablewareDto.getPage(),
                        tablewareDto.getCount(),
                        "/code/tableware/getTablewareByCondition");
        return result;
    }
}
