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

 Date: 04/03/2025 15:25:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gas_station
-- ----------------------------
DROP TABLE IF EXISTS `gas_station`;
CREATE TABLE `gas_station`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '加油站名称',
  `longitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '经度',
  `latitude` decimal(9, 6) NULL DEFAULT NULL COMMENT '纬度',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0' COMMENT '删除标识',
  `create_time` datetime NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gas_station
-- ----------------------------
INSERT INTO `gas_station` VALUES (1, '加油站1', NULL, NULL, '2', '2025-02-25 17:00:05', NULL, NULL, NULL, '北京市朝阳区');
INSERT INTO `gas_station` VALUES (2, '望京分店', 116.475380, 40.019924, '0', '2025-02-26 14:05:27', NULL, '2025-02-26 15:06:57', NULL, '望京soho');
INSERT INTO `gas_station` VALUES (3, '立水桥店', 116.473127, 40.019423, '0', '2025-02-26 14:23:45', NULL, '2025-03-04 12:57:42', 'admin', '立水桥地铁站');

SET FOREIGN_KEY_CHECKS = 1;
