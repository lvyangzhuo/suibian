package com.example.suibian.modular.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.suibian.modular.sys.model.SysUser;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> listByRoleId(Long roleId);

}
