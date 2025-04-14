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

 Date: 04/03/2025 15:25:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gas_product
-- ----------------------------
DROP TABLE IF EXISTS `gas_product`;
CREATE TABLE `gas_product`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '名称',
  `price` decimal(5, 2) NULL DEFAULT NULL COMMENT '油价',
  `station_id` int NULL DEFAULT NULL COMMENT '加油站id',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0' COMMENT '删除标识',
  `create_time` datetime NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gas_product
-- ----------------------------
INSERT INTO `gas_product` VALUES (1, '92号汽油', 7.50, NULL, '2', '2025-02-26 14:51:25', NULL, NULL, NULL);
INSERT INTO `gas_product` VALUES (2, '95号汽油', 8.00, NULL, '2', '2025-02-26 14:51:36', NULL, NULL, NULL);
INSERT INTO `gas_product` VALUES (3, '98号汽油', 9.00, NULL, '2', '2025-02-26 14:51:47', NULL, NULL, NULL);
INSERT INTO `gas_product` VALUES (4, '92号汽油', 7.50, 2, '0', '2025-02-26 14:53:22', NULL, NULL, NULL);
INSERT INTO `gas_product` VALUES (5, '95号汽油', 8.00, 2, '0', '2025-02-26 14:53:32', NULL, NULL, NULL);
INSERT INTO `gas_product` VALUES (6, '98号汽油', 9.00, 2, '0', '2025-02-26 14:53:37', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
