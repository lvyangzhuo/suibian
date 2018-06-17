package com.example.suibian.modular.sys.controller;

import com.example.suibian.base.controller.BaseController;
import com.example.suibian.modular.sys.service.ISysUserService;
import com.example.suibian.modular.sys.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户信息控制器
 *
 * @author lyz
 * @Date 2018-06-17 11:15:05
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController extends BaseController {

    private String PREFIX = "/sys/sysUser/";

    @Autowired
    private ISysUserService sysUserService;

    /**
     * 跳转到用户信息首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "sysUser.html";
    }

    /**
     * 跳转到添加用户信息
     */
    @RequestMapping("/sysUser_add")
    public String sysUserAdd() {
        return PREFIX + "sysUser_add.html";
    }

    /**
     * 获取用户信息列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sysUserService.selectList(null);
    }

    /**
     * 新增用户信息
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SysUser sysUser) {
        sysUserService.insert(sysUser);
        return SUCCESS_TIP;
    }

    /**
     * 删除用户信息
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sysUserId) {
        sysUserService.deleteById(sysUserId);
        return SUCCESS_TIP;
    }

    /**
     * 修改用户信息
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SysUser sysUser) {
        sysUserService.updateById(sysUser);
        return SUCCESS_TIP;
    }

    /**
     * 用户信息详情
     */
    @RequestMapping(value = "/detail/{sysUserId}")
    @ResponseBody
    public Object detail(@PathVariable("sysUserId") Integer sysUserId) {
        return sysUserService.selectById(sysUserId);
    }
}
