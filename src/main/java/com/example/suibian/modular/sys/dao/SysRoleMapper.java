package com.example.suibian.modular.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.suibian.modular.sys.model.SysRole;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> listRolesByUserId(Long userId);

}
