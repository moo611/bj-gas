/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : ry-vue

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 04/03/2025 15:25:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gas_user
-- ----------------------------
DROP TABLE IF EXISTS `gas_user`;
CREATE TABLE `gas_user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `role` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '0、管理员1、用户',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0' COMMENT '删除标识',
  `create_time` datetime NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gas_user
-- ----------------------------
INSERT INTO `gas_user` VALUES (1, 'admin', '$2a$10$AT72xiK2kl5Ck4m/lOlX4ea6.f1YaCO2h8au/dDjXnibrHnH1k/mi', '管理员', '0', '0', '2025-02-25 16:47:20', NULL, NULL, NULL);
INSERT INTO `gas_user` VALUES (2, 'user1', '$2a$10$.xDc8ir7sFyVo9IcreeYtez4m6rJ4KwcGoZca7LwPhNt40ogh22kK', '张三', '1', '0', '2025-03-01 19:45:50', NULL, NULL, NULL);
INSERT INTO `gas_user` VALUES (3, 'user2', '$2a$10$Szse5QmV/vCwC7ZkeCmABOvPPV0mkBv0fPy.9a5r3jEuIPofUJwKG', '李四', '1', '0', '2025-03-01 19:46:29', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
