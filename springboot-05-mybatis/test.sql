/*
 Navicat Premium Data Transfer

 Source Server         : chen
 Source Server Type    : MySQL
 Source Server Version : 50711
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50711
 File Encoding         : 65001

 Date: 07/10/2019 17:19:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `sex` int(11) NULL DEFAULT NULL COMMENT '性别',
  `user_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 2, '3', 1, '222');
INSERT INTO `user` VALUES (4, 123, 'Tset', 2, 'updatetest');
INSERT INTO `user` VALUES (5, 123, 'Tset', 2, 'zhangyutong');
INSERT INTO `user` VALUES (6, 123, 'Tset', 2, 'zhangyutong');
INSERT INTO `user` VALUES (7, 123, 'Tset', 2, 'zhangyutong');

SET FOREIGN_KEY_CHECKS = 1;
