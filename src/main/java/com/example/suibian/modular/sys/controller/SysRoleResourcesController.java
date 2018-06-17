package com.example.suibian.modular.sys.controller;

import com.example.suibian.base.controller.BaseController;
import com.example.suibian.modular.sys.service.ISysRoleResourcesService;
import com.example.suibian.modular.sys.model.SysRoleResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 角色资源中间表控制器
 *
 * @author lyz
 * @Date 2018-06-17 11:15:50
 */
@Controller
@RequestMapping("/sysRoleResources")
public class SysRoleResourcesController extends BaseController {

    private String PREFIX = "/sys/sysRoleResources/";

    @Autowired
    private ISysRoleResourcesService sysRoleResourcesService;

    /**
     * 跳转到角色资源中间表首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "sysRoleResources.html";
    }

    /**
     * 跳转到添加角色资源中间表
     */
    @RequestMapping("/sysRoleResources_add")
    public String sysRoleResourcesAdd() {
        return PREFIX + "sysRoleResources_add.html";
    }

    /**
     * 获取角色资源中间表列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sysRoleResourcesService.selectList(null);
    }

    /**
     * 新增角色资源中间表
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SysRoleResources sysRoleResources) {
        sysRoleResourcesService.insert(sysRoleResources);
        return SUCCESS_TIP;
    }

    /**
     * 删除角色资源中间表
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sysRoleResourcesId) {
        sysRoleResourcesService.deleteById(sysRoleResourcesId);
        return SUCCESS_TIP;
    }

    /**
     * 修改角色资源中间表
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SysRoleResources sysRoleResources) {
        sysRoleResourcesService.updateById(sysRoleResources);
        return SUCCESS_TIP;
    }

    /**
     * 角色资源中间表详情
     */
    @RequestMapping(value = "/detail/{sysRoleResourcesId}")
    @ResponseBody
    public Object detail(@PathVariable("sysRoleResourcesId") Integer sysRoleResourcesId) {
        return sysRoleResourcesService.selectById(sysRoleResourcesId);
    }
}
