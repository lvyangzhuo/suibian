package com.example.suibian.modular.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.suibian.exception.SuibianException;
import com.example.suibian.holder.RequestHolder;
import com.example.suibian.modular.sys.entity.User;
import com.example.suibian.modular.sys.service.ISysUserService;
import com.example.suibian.modular.sys.dao.SysUserMapper;
import com.example.suibian.modular.sys.model.SysUser;
import com.example.suibian.utils.IpUtil;
import com.example.suibian.utils.PasswordUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    /**
     * 更新用户最后一次登录的状态信息
     *
     * @param user
     * @return
     */
    @Override
    public SysUser updateUserLastLoginInfo(SysUser user) {
        if (user != null) {
            user.setLoginCount(user.getLoginCount() + 1);
            user.setLastLoginTime(new Date());
            user.setLastLoginIp(IpUtil.getRealIp(RequestHolder.getRequest()));
            user.setPassword(null);
            this.updateById(user);
        }
        return user;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateSelective(User user) {
        Assert.notNull(user, "User不可为空！");
        user.setUpdateTime(new Date());
        if (!StringUtils.isEmpty(user.getPassword())) {
            try {
                user.setPassword(PasswordUtil.encrypt(user.getPassword(), user.getUsername()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new SuibianException(-1,"密码加密失败");
            }
        } else {
            user.setPassword(null);
        }
        return this.updateById(user.getSysUser());
    }
}
