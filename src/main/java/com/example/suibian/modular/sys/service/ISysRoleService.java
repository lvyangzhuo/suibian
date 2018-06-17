package com.example.suibian.modular.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.suibian.modular.sys.entity.Role;
import com.example.suibian.modular.sys.model.SysRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
public interface ISysRoleService extends IService<SysRole> {

    List<Role> listRolesByUserId(Long userId);
}
