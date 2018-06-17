package com.example.suibian.modular.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.suibian.modular.sys.entity.User;
import com.example.suibian.modular.sys.model.SysUser;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 更新用户最后一次登录的状态信息
     *
     * @param user
     * @return
     */
    SysUser updateUserLastLoginInfo(SysUser user);

    @Transactional(rollbackFor = Exception.class)
    boolean updateSelective(User user);
}
