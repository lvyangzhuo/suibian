package com.example.suibian.modular.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.suibian.modular.sys.entity.Role;
import com.example.suibian.modular.sys.service.ISysRoleService;
import com.example.suibian.modular.sys.dao.SysRoleMapper;
import com.example.suibian.modular.sys.model.SysRole;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Resource
    private SysRoleMapper roleMapper;

    /**
     * 获取用户的角色
     *
     * @param userId
     * @return
     */
    @Override
    public List<Role> listRolesByUserId(Long userId) {
        List<SysRole> sysRoles = roleMapper.listRolesByUserId(userId);
        if (CollectionUtils.isEmpty(sysRoles)) {
            return null;
        }
        List<Role> roles = new ArrayList<>();
        for (SysRole r : sysRoles) {
            roles.add(new Role(r));
        }
        return roles;
    }
}
