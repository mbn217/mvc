/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.171
Source Server Version : 50640
Source Host           : 192.168.1.171:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-04-26 17:34:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `age` int(11) NOT NULL DEFAULT '0' COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'hello', '20');
