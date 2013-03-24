/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : gcms

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2013-03-25 00:21:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `contacts`
-- ----------------------------
DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contacts
-- ----------------------------
INSERT INTO `contacts` VALUES ('1', 'san', 'zhang', '1234', 'test@email.com', '2012-11-29 21:34:23');
INSERT INTO `contacts` VALUES ('2', 'first', 'last', '435', 'em', '2012-11-29 22:36:19');
INSERT INTO `contacts` VALUES ('4', 'faew', 'faew', 'afw', 'awfe', '2012-11-29 23:09:26');
INSERT INTO `contacts` VALUES ('5', '7', '8', '10', '9', '2012-12-08 16:38:58');
INSERT INTO `contacts` VALUES ('6', 'YY', 'Y', 'UY', 'Y', '2013-01-20 20:29:03');
INSERT INTO `contacts` VALUES ('7', 'cms', 'ui', 'te', 'em', '2013-01-20 20:43:43');

-- ----------------------------
-- Table structure for `g_role`
-- ----------------------------
DROP TABLE IF EXISTS `g_role`;
CREATE TABLE `g_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) NOT NULL COMMENT '名称',
  `status` int(11) NOT NULL,
  `priority` int(11) NOT NULL DEFAULT '10' COMMENT '排列顺序',
  `need_captcha` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否需要验证码',
  `need_check` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否需要审核',
  `is_default` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否默认会员组',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='CMS角色表';

-- ----------------------------
-- Records of g_role
-- ----------------------------
INSERT INTO `g_role` VALUES ('1', 'user', '1', '10', '1', '1', '1');

-- ----------------------------
-- Table structure for `g_user`
-- ----------------------------
DROP TABLE IF EXISTS `g_user`;
CREATE TABLE `g_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `status` int(11) DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `last_login_ip` varchar(50) DEFAULT '127.0.0.1' COMMENT '最后登录IP',
  `login_count` int(11) DEFAULT '0' COMMENT '登录次数',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `ak_username` (`username`),
  KEY `fk_g_user_role` (`role_id`),
  CONSTRAINT `fk_g_user_role` FOREIGN KEY (`role_id`) REFERENCES `g_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='gcms用户表';

-- ----------------------------
-- Records of g_user
-- ----------------------------
INSERT INTO `g_user` VALUES ('1', '1', 'aa', 'bb', '0', null, null, '0');
