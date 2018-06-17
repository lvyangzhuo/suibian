package com.example.suibian.modular.sys.controller;

import com.example.suibian.base.controller.BaseController;
import com.example.suibian.modular.sys.model.SysUserRole;
import com.example.suibian.modular.sys.service.ISysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 角色用户中间表控制器
 *
 * @author lyz
 * @Date 2018-06-17 11:16:06
 */
@Controller
@RequestMapping("/sysUserRole")
public class SysUserRoleController extends BaseController {

    private String PREFIX = "/sys/sysUserRole/";

    @Autowired
    private ISysUserRoleService sysUserRoleService;

    /**
     * 获取角色用户中间表列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sysUserRoleService.selectList(null);
    }

    /**
     * 新增角色用户中间表
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SysUserRole sysUserRole) {
        sysUserRoleService.insert(sysUserRole);
        return SUCCESS_TIP;
    }

    /**
     * 删除角色用户中间表
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sysUserRoleId) {
        sysUserRoleService.deleteById(sysUserRoleId);
        return SUCCESS_TIP;
    }

    /**
     * 修改角色用户中间表
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SysUserRole sysUserRole) {
        sysUserRoleService.updateById(sysUserRole);
        return SUCCESS_TIP;
    }

    /**
     * 角色用户中间表详情
     */
    @RequestMapping(value = "/detail/{sysUserRoleId}")
    @ResponseBody
    public Object detail(@PathVariable("sysUserRoleId") Integer sysUserRoleId) {
        return sysUserRoleService.selectById(sysUserRoleId);
    }
}
