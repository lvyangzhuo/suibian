package com.example.suibian.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * jquery ztree 插件的节点
 * 
 * @author lyz
 * @date 2017年2月17日 下午8:25:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZTreeNode {

	/**
	 * 节点id
	 */
	private Long id;

	/**
	 * 父节点id
	 */
	private Long pId;

	/**
	 * 节点名称
	 */
	private String name;

	/**
	 * 是否打开节点
	 */
	private Boolean open;

	/**
	 * 是否被选中
	 */
	private Boolean checked;

	public static ZTreeNode createParent(){
		ZTreeNode zTreeNode = new ZTreeNode();
		zTreeNode.setChecked(true);
		zTreeNode.setId(0L);
		zTreeNode.setName("顶级");
		zTreeNode.setOpen(true);
		zTreeNode.setPId(0L);
		return zTreeNode;
	}
}
