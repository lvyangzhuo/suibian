package com.example.suibian.modular.sys.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author stylefeng
 * @since 2017-07-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 序号
     */
	private Integer num;
    /**
     * 父角色id
     */
	private Integer pid;
    /**
     * 角色名称
     */
	private String name;
    /**
     * 部门名称
     */
	private Integer deptid;
    /**
     * 提示
     */
	private String tips;
    /**
     * 保留字段(暂时没用）
     */
	private Integer version;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
