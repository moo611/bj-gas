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

 Date: 04/03/2025 15:25:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gas_coupon
-- ----------------------------
DROP TABLE IF EXISTS `gas_coupon`;
CREATE TABLE `gas_coupon`  (
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '识别码',
  `discount` decimal(10, 2) NULL DEFAULT NULL COMMENT '抵扣价',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '名称',
  `receiver` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '领取人',
  `status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0' COMMENT '0、未领取1、已领取2、已使用',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0' COMMENT '删除标识',
  `create_time` datetime NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gas_coupon
-- ----------------------------
INSERT INTO `gas_coupon` VALUES ('35fcbf5a0a1c4901', 10.00, '96号汽油专用', 'user1', '2', '0', '2025-03-03 17:10:42', 'admin', '2025-03-03 17:14:07', 'user1');
INSERT INTO `gas_coupon` VALUES ('38a505e9f1594685', 20.00, '汽油20元优惠券', NULL, '0', '0', '2025-03-03 17:09:15', 'admin', NULL, NULL);
INSERT INTO `gas_coupon` VALUES ('5fe2de18b4db4c3a', 10.00, '92号汽油专用', NULL, '0', '0', '2025-03-03 17:08:48', 'admin', NULL, NULL);
INSERT INTO `gas_coupon` VALUES ('6a3035b15ba54153', 111.00, '测试优惠2', NULL, '0', '0', '2025-03-04 11:35:00', 'admin', NULL, NULL);
INSERT INTO `gas_coupon` VALUES ('72540b4ad8cc4c65', 15.00, '汽油15元抵扣券', NULL, '0', '0', '2025-03-03 17:08:32', 'admin', NULL, NULL);
INSERT INTO `gas_coupon` VALUES ('ad51d2fdf5684ce3', 111.00, '测试优惠1', NULL, '0', '0', '2025-03-04 11:34:53', 'admin', NULL, NULL);
INSERT INTO `gas_coupon` VALUES ('c5fc0948852c47b2', 10.00, '汽油十元抵扣券', NULL, '0', '0', '2025-02-26 16:05:09', 'admin', '2025-02-26 16:08:42', 'admin');
INSERT INTO `gas_coupon` VALUES ('d92583afcfe54f2e', 15.00, '95号汽油专用', NULL, '0', '0', '2025-03-03 17:09:01', 'admin', NULL, NULL);
INSERT INTO `gas_coupon` VALUES ('e9bb52675edb42de', 11.00, '测试优惠3', NULL, '0', '0', '2025-03-04 11:35:10', 'admin', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
