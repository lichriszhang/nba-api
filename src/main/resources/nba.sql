/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : nba

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 14/01/2019 21:58:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for players
-- ----------------------------
DROP TABLE IF EXISTS `players`;
CREATE TABLE `players`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `number` int(11) NULL DEFAULT NULL,
  `team` int(11) NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `height` float NULL DEFAULT NULL,
  `score` float NULL DEFAULT NULL,
  `assist` float NULL DEFAULT NULL,
  `rebound` float NULL DEFAULT NULL,
  `steal` float NULL DEFAULT NULL COMMENT '抢断',
  `block` float NULL DEFAULT NULL COMMENT '盖帽',
  `miss` float NULL DEFAULT NULL,
  `play_time` float NULL DEFAULT NULL,
  `illegal` float NULL DEFAULT NULL,
  `three_point` float NULL DEFAULT NULL,
  `penalty` float NULL DEFAULT NULL COMMENT '罚球',
  `players_year` year NULL DEFAULT NULL COMMENT '选秀年',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `xxx_idx`(`team`) USING BTREE,
  CONSTRAINT `xxx` FOREIGN KEY (`team`) REFERENCES `teams` (` team_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for teams
-- ----------------------------
DROP TABLE IF EXISTS `teams`;
CREATE TABLE `teams`  (
  ` team_id` int(11) NOT NULL AUTO_INCREMENT,
  `team_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `team_win` int(11) NULL DEFAULT NULL,
  `team_lose` int(11) NULL DEFAULT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `team_boss` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ranking` int(11) NULL DEFAULT NULL COMMENT '排名',
  `team_city` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `team_area` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `team_logo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (` team_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teams
-- ----------------------------
INSERT INTO `teams` VALUES (1, 'lakers', 23, 21, NULL, NULL, 8, 'Los Angela', 'west', 'lakers');
INSERT INTO `teams` VALUES (2, 'rocket', 24, 18, NULL, NULL, 6, 'Houston', 'west', 'rocket');
INSERT INTO `teams` VALUES (3, 'bucks', 30, 12, NULL, NULL, 2, 'Milwaukee', 'east', 'Milwaukee');
INSERT INTO `teams` VALUES (4, 'celtic', 25, 17, NULL, NULL, 5, 'Boston', 'east', 'Boston');
INSERT INTO `teams` VALUES (5, 'heat', 21, 20, NULL, NULL, 6, 'Miami', 'east', 'Miami');

SET FOREIGN_KEY_CHECKS = 1;
