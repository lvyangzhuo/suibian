/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_mysql_root
Source Server Version : 50719
Source Host           : 127.0.0.1:3306
Source Database       : suibian

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-06-08 15:30:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_relation`;
CREATE TABLE `sys_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `menuid` bigint(11) DEFAULT NULL COMMENT '菜单id',
  `roleid` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3737 DEFAULT CHARSET=utf8 COMMENT='角色和菜单关联表';

-- ----------------------------
-- Records of sys_relation
-- ----------------------------
INSERT INTO `sys_relation` VALUES ('3377', '105', '5');
INSERT INTO `sys_relation` VALUES ('3378', '106', '5');
INSERT INTO `sys_relation` VALUES ('3379', '107', '5');
INSERT INTO `sys_relation` VALUES ('3380', '108', '5');
INSERT INTO `sys_relation` VALUES ('3381', '109', '5');
INSERT INTO `sys_relation` VALUES ('3382', '110', '5');
INSERT INTO `sys_relation` VALUES ('3383', '111', '5');
INSERT INTO `sys_relation` VALUES ('3384', '112', '5');
INSERT INTO `sys_relation` VALUES ('3385', '113', '5');
INSERT INTO `sys_relation` VALUES ('3386', '114', '5');
INSERT INTO `sys_relation` VALUES ('3387', '115', '5');
INSERT INTO `sys_relation` VALUES ('3388', '116', '5');
INSERT INTO `sys_relation` VALUES ('3389', '117', '5');
INSERT INTO `sys_relation` VALUES ('3390', '118', '5');
INSERT INTO `sys_relation` VALUES ('3391', '119', '5');
INSERT INTO `sys_relation` VALUES ('3392', '120', '5');
INSERT INTO `sys_relation` VALUES ('3393', '121', '5');
INSERT INTO `sys_relation` VALUES ('3394', '122', '5');
INSERT INTO `sys_relation` VALUES ('3395', '150', '5');
INSERT INTO `sys_relation` VALUES ('3396', '151', '5');
INSERT INTO `sys_relation` VALUES ('3679', '105', '1');
INSERT INTO `sys_relation` VALUES ('3680', '106', '1');
INSERT INTO `sys_relation` VALUES ('3681', '107', '1');
INSERT INTO `sys_relation` VALUES ('3682', '108', '1');
INSERT INTO `sys_relation` VALUES ('3683', '109', '1');
INSERT INTO `sys_relation` VALUES ('3684', '110', '1');
INSERT INTO `sys_relation` VALUES ('3685', '111', '1');
INSERT INTO `sys_relation` VALUES ('3686', '112', '1');
INSERT INTO `sys_relation` VALUES ('3687', '113', '1');
INSERT INTO `sys_relation` VALUES ('3688', '165', '1');
INSERT INTO `sys_relation` VALUES ('3689', '166', '1');
INSERT INTO `sys_relation` VALUES ('3690', '167', '1');
INSERT INTO `sys_relation` VALUES ('3691', '114', '1');
INSERT INTO `sys_relation` VALUES ('3692', '115', '1');
INSERT INTO `sys_relation` VALUES ('3693', '116', '1');
INSERT INTO `sys_relation` VALUES ('3694', '117', '1');
INSERT INTO `sys_relation` VALUES ('3695', '118', '1');
INSERT INTO `sys_relation` VALUES ('3696', '162', '1');
INSERT INTO `sys_relation` VALUES ('3697', '163', '1');
INSERT INTO `sys_relation` VALUES ('3698', '164', '1');
INSERT INTO `sys_relation` VALUES ('3699', '119', '1');
INSERT INTO `sys_relation` VALUES ('3700', '120', '1');
INSERT INTO `sys_relation` VALUES ('3701', '121', '1');
INSERT INTO `sys_relation` VALUES ('3702', '122', '1');
INSERT INTO `sys_relation` VALUES ('3703', '150', '1');
INSERT INTO `sys_relation` VALUES ('3704', '151', '1');
INSERT INTO `sys_relation` VALUES ('3705', '128', '1');
INSERT INTO `sys_relation` VALUES ('3706', '134', '1');
INSERT INTO `sys_relation` VALUES ('3707', '158', '1');
INSERT INTO `sys_relation` VALUES ('3708', '159', '1');
INSERT INTO `sys_relation` VALUES ('3709', '130', '1');
INSERT INTO `sys_relation` VALUES ('3710', '131', '1');
INSERT INTO `sys_relation` VALUES ('3711', '135', '1');
INSERT INTO `sys_relation` VALUES ('3712', '136', '1');
INSERT INTO `sys_relation` VALUES ('3713', '137', '1');
INSERT INTO `sys_relation` VALUES ('3714', '152', '1');
INSERT INTO `sys_relation` VALUES ('3715', '153', '1');
INSERT INTO `sys_relation` VALUES ('3716', '154', '1');
INSERT INTO `sys_relation` VALUES ('3717', '132', '1');
INSERT INTO `sys_relation` VALUES ('3718', '138', '1');
INSERT INTO `sys_relation` VALUES ('3719', '139', '1');
INSERT INTO `sys_relation` VALUES ('3720', '140', '1');
INSERT INTO `sys_relation` VALUES ('3721', '155', '1');
INSERT INTO `sys_relation` VALUES ('3722', '156', '1');
INSERT INTO `sys_relation` VALUES ('3723', '157', '1');
INSERT INTO `sys_relation` VALUES ('3724', '133', '1');
INSERT INTO `sys_relation` VALUES ('3725', '160', '1');
INSERT INTO `sys_relation` VALUES ('3726', '161', '1');
INSERT INTO `sys_relation` VALUES ('3727', '141', '1');
INSERT INTO `sys_relation` VALUES ('3728', '142', '1');
INSERT INTO `sys_relation` VALUES ('3729', '143', '1');
INSERT INTO `sys_relation` VALUES ('3730', '144', '1');
INSERT INTO `sys_relation` VALUES ('3731', '148', '1');
INSERT INTO `sys_relation` VALUES ('3732', '145', '1');
INSERT INTO `sys_relation` VALUES ('3733', '149', '1');
INSERT INTO `sys_relation` VALUES ('3734', '168', '1');
INSERT INTO `sys_relation` VALUES ('3735', '169', '1');
INSERT INTO `sys_relation` VALUES ('3736', '170', '1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` int(11) DEFAULT NULL COMMENT '序号',
  `pid` int(11) DEFAULT NULL COMMENT '父角色id',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `deptid` int(11) DEFAULT NULL COMMENT '部门名称',
  `tips` varchar(255) DEFAULT NULL COMMENT '提示',
  `version` int(11) DEFAULT NULL COMMENT '保留字段(暂时没用）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '1', '0', '超级管理员', '24', 'administrator', '1');
INSERT INTO `sys_role` VALUES ('5', '2', '1', '临时', '26', 'temp', null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `account` varchar(45) DEFAULT NULL COMMENT '账号',
  `password` varchar(45) DEFAULT NULL COMMENT '密码',
  `salt` varchar(45) DEFAULT NULL COMMENT 'md5密码盐',
  `name` varchar(45) DEFAULT NULL COMMENT '名字',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `sex` int(11) DEFAULT NULL COMMENT '性别（1：男 2：女）',
  `email` varchar(45) DEFAULT NULL COMMENT '电子邮件',
  `phone` varchar(45) DEFAULT NULL COMMENT '电话',
  `roleid` varchar(255) DEFAULT NULL COMMENT '角色id',
  `deptid` int(11) DEFAULT NULL COMMENT '部门id',
  `status` int(11) DEFAULT NULL COMMENT '状态(1：启用  2：冻结  3：删除）',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `version` int(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'girl.gif', 'admin', 'ecfadcde9305f8891bcfe5a1e28c253e', '8pgby', '张三', '2017-05-05 00:00:00', '2', 'sn93@qq.com', '18200000000', '1', '27', '1', '2016-01-29 08:49:53', '25');
INSERT INTO `sys_user` VALUES ('44', null, 'test', '45abb7879f6a8268f1ef600e6038ac73', 'ssts3', 'test', '2017-05-01 00:00:00', '1', 'abc@123.com', '', '5', '26', '3', '2017-05-16 20:33:37', null);
INSERT INTO `sys_user` VALUES ('45', null, 'boss', '71887a5ad666a18f709e1d4e693d5a35', '1f7bf', '老板', '2017-12-04 00:00:00', '1', '', '', '1', '24', '1', '2017-12-04 22:24:02', null);
INSERT INTO `sys_user` VALUES ('46', null, 'manager', 'b53cac62e7175637d4beb3b16b2f7915', 'j3cs9', '经理', '2017-12-04 00:00:00', '1', '', '', '1', '24', '1', '2017-12-04 22:24:24', null);
