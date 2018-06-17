package com.example.suibian.modular.sys.controller;


import com.example.suibian.base.controller.BaseController;
import com.example.suibian.modular.sys.model.SysResources;
import com.example.suibian.modular.sys.service.ISysResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 资源控制器
 *
 * @author lyz
 * @Date 2018-06-17 11:15:33
 */
@Controller
@RequestMapping("/sysResources")
public class SysResourcesController extends BaseController {

    private String PREFIX = "/sys/sysResources/";

    @Autowired
    private ISysResourcesService sysResourcesService;

    /**
     * 获取资源列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sysResourcesService.selectList(null);
    }

    /**
     * 新增资源
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SysResources sysResources) {
        sysResourcesService.insert(sysResources);
        return SUCCESS_TIP;
    }

    /**
     * 删除资源
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sysResourcesId) {
        sysResourcesService.deleteById(sysResourcesId);
        return SUCCESS_TIP;
    }

    /**
     * 修改资源
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SysResources sysResources) {
        sysResourcesService.updateById(sysResources);
        return SUCCESS_TIP;
    }

    /**
     * 资源详情
     */
    @RequestMapping(value = "/detail/{sysResourcesId}")
    @ResponseBody
    public Object detail(@PathVariable("sysResourcesId") Integer sysResourcesId) {
        return sysResourcesService.selectById(sysResourcesId);
    }
}
