package com.example.suibian.modular.sys.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String username;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * QQ
     */
    private String qq;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 头像地址
     */
    private String avatar;
    /**
     * 超级管理员、管理员、普通用户
     */
    @TableField("user_type")
    private String userType;
    /**
     * 注册IP
     */
    @TableField("reg_ip")
    private String regIp;
    /**
     * 最近登录IP
     */
    @TableField("last_login_ip")
    private String lastLoginIp;
    /**
     * 最近登录时间
     */
    @TableField("last_login_time")
    private Date lastLoginTime;
    /**
     * 登录次数
     */
    @TableField("login_count")
    private Integer loginCount;
    /**
     * 用户备注
     */
    private String remark;
    /**
     * 用户状态
     */
    private Integer status;
    /**
     * 注册时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
