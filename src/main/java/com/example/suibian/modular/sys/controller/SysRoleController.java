package com.example.suibian.modular.sys.controller;

import com.example.suibian.base.controller.BaseController;
import com.example.suibian.modular.sys.model.SysRole;
import com.example.suibian.modular.sys.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 角色控制器
 *
 * @author lyz
 * @Date 2018-06-17 11:15:17
 */
@Controller
@RequestMapping("/sysRole")
public class SysRoleController extends BaseController {

    private String PREFIX = "/sys/sysRole/";

    @Autowired
    private ISysRoleService sysRoleService;

    /**
     * 获取角色列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sysRoleService.selectList(null);
    }

    /**
     * 新增角色
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SysRole sysRole) {
        sysRoleService.insert(sysRole);
        return SUCCESS_TIP;
    }

    /**
     * 删除角色
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sysRoleId) {
        sysRoleService.deleteById(sysRoleId);
        return SUCCESS_TIP;
    }

    /**
     * 修改角色
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SysRole sysRole) {
        sysRoleService.updateById(sysRole);
        return SUCCESS_TIP;
    }

    /**
     * 角色详情
     */
    @RequestMapping(value = "/detail/{sysRoleId}")
    @ResponseBody
    public Object detail(@PathVariable("sysRoleId") Integer sysRoleId) {
        return sysRoleService.selectById(sysRoleId);
    }
}
