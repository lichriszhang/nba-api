/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : nba

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-01-15 21:21:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for players
-- ----------------------------
DROP TABLE IF EXISTS `players`;
CREATE TABLE `players` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `number` int(11) DEFAULT NULL,
  `team` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `height` float DEFAULT NULL,
  `score` float DEFAULT NULL,
  `assist` float DEFAULT NULL,
  `rebound` float DEFAULT NULL,
  `steal` float DEFAULT NULL COMMENT '抢断',
  `block` float DEFAULT NULL COMMENT '盖帽',
  `miss` float DEFAULT NULL,
  `play_time` float DEFAULT NULL,
  `illegal` float DEFAULT NULL,
  `three_point` float DEFAULT NULL,
  `penalty` float DEFAULT NULL COMMENT '罚球',
  `players_year` year(4) DEFAULT NULL COMMENT '选秀年',
  PRIMARY KEY (`id`),
  KEY `xxx_idx` (`team`),
  CONSTRAINT `aa` FOREIGN KEY (`team`) REFERENCES `teams` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of players
-- ----------------------------
INSERT INTO `players` VALUES ('1', 'LeBron James', '23', '1', '34', '203', '27.3', '8.3', '7.1', '1.3', '1.1', '3.4', '38', '4.1', '5', '9', '2003');
INSERT INTO `players` VALUES ('2', 'James Harden', '13', '2', '27', '192', '34.2', '8.8', '6.2', '2.1', '0.6', '5.6', '37.2', '3.4', '13', '13', '2008');
INSERT INTO `players` VALUES ('3', 'Anthony Davis', '23', '28', '27', '206', '29.4', '13.3', '4.4', '1', '2.5', '4', '36', '4', '3.2', '9', '2009');
INSERT INTO `players` VALUES ('4', 'Kely Irving', '2', '4', '27', '196', '22.7', '4.8', '6.4', '2', '0.8', '4.2', '30', '4.1', '6.1', '10', '2011');
INSERT INTO `players` VALUES ('5', 'Giannis Antetokounmpo', '34', '3', '25', '210.8', '26.7', '5.9', '12.6', '1.3', '1.5', '4.1', '33.5', '3.4', '2', '13', '2013');
INSERT INTO `players` VALUES ('6', 'Stephen Curry', '30', '6', '30', '190.5', '29.4', '5.6', '5.2', '1.3', '0.4', '3', '34.6', '2.6', '9.2', '10.1', '2009');
INSERT INTO `players` VALUES ('7', 'Kevin Durant', '35', '6', '30', '205.7', '28.2', '6.1', '7.3', '0.8', '1.1', '3.3', '35.7', '1.9', '8.9', '9.8', '2007');

-- ----------------------------
-- Table structure for teams
-- ----------------------------
DROP TABLE IF EXISTS `teams`;
CREATE TABLE `teams` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `team_name` varchar(30) NOT NULL,
  `team_win` int(11) DEFAULT NULL,
  `team_lose` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `team_boss` varchar(30) DEFAULT NULL,
  `ranking` int(11) DEFAULT NULL COMMENT '排名',
  `team_city` varchar(30) DEFAULT NULL,
  `team_area` varchar(30) DEFAULT NULL,
  `team_logo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teams
-- ----------------------------
INSERT INTO `teams` VALUES ('1', 'Lakers', '23', '21', null, '', '9', 'Los Angelas', 'west', 'lakers');
INSERT INTO `teams` VALUES ('2', 'Rocket', '24', '18', null, '', '4', 'Houston', 'west', 'rocket');
INSERT INTO `teams` VALUES ('3', 'Bucks', '30', '12', null, '', '2', 'Milwaukee', 'east', 'bucks');
INSERT INTO `teams` VALUES ('4', 'Celtic', '25', '17', null, '', '5', 'Boston', 'east', 'celtic');
INSERT INTO `teams` VALUES ('5', 'Heat', '21', '20', null, '', '6', 'Miami', 'east', 'heat');
INSERT INTO `teams` VALUES ('6', 'Warrion', '29', '14', null, '', '2', 'Goden State', 'west', 'warrion');
INSERT INTO `teams` VALUES ('7', '76ers', '28', '16', null, '', '4', 'Philadelphia ', 'east', '76ers');
INSERT INTO `teams` VALUES ('8', 'Sun', '11', '33', null, '', '15', 'Phoenix ', 'west', 'sun');
INSERT INTO `teams` VALUES ('9', 'Raptors', '33', '12', null, '', '1', 'Toronto', 'east', 'raptors');
INSERT INTO `teams` VALUES ('10', 'Spurs', '25', '20', null, '', '7', 'San Antonio', 'west', 'spurs');
INSERT INTO `teams` VALUES ('11', 'Thunder', '26', '16', null, '', '3', 'Oklahoma', 'west', '');
INSERT INTO `teams` VALUES ('12', 'Mavericks', '20', '23', null, '', '13', 'Dallas', 'west', 'mavericks');
INSERT INTO `teams` VALUES ('13', 'Kings', '23', '21', null, '', '10', 'Sacramento ', 'west', 'kings');
INSERT INTO `teams` VALUES ('14', 'Grizzlies', '19', '24', null, '', '14', 'Memphis ', 'west', '');
INSERT INTO `teams` VALUES ('15', 'Timberwolves', '21', '22', null, '', '11', 'Minnesota ', 'west', '');
INSERT INTO `teams` VALUES ('16', 'Nuggets', '29', '13', null, '', '1', 'Denver ', 'west', '');
INSERT INTO `teams` VALUES ('17', 'Clippers', '24', '19', null, '', '6', 'Los Angelas', 'west', '');
INSERT INTO `teams` VALUES ('18', 'Blazers', '26', '19', null, '', '5', 'Portland ', 'west', '');
INSERT INTO `teams` VALUES ('19', 'Jazz', '24', '21', null, '', '8', 'Utah ', 'west', '');
INSERT INTO `teams` VALUES ('20', 'Hornets', '20', '23', null, '', '8', 'Hornets', 'east', '');
INSERT INTO `teams` VALUES ('21', 'Pistons', '18', '23', null, '', '10', 'Detroit ', 'east', '');
INSERT INTO `teams` VALUES ('22', 'Cavaliers', '9', '35', null, '', '15', 'Cleveland ', 'east', '');
INSERT INTO `teams` VALUES ('23', 'Wizards', '18', '26', null, '', '11', 'Wizards', 'east', '');
INSERT INTO `teams` VALUES ('24', 'Magic', '19', '24', null, '', '9', 'Orlando ', 'east', '');
INSERT INTO `teams` VALUES ('25', 'Bulls', '10', '33', null, '', '13', 'Chicago ', 'east', '');
INSERT INTO `teams` VALUES ('26', 'Pacers', '28', '14', null, '', '3', 'Indiana ', 'east', '');
INSERT INTO `teams` VALUES ('27', 'Knicks', '10', '33', null, '', '14', 'New York', 'east', '');
INSERT INTO `teams` VALUES ('28', 'Pelicans', '21', '23', null, '', '12', 'New Orleans', 'east', '');
INSERT INTO `teams` VALUES ('29', 'Hawks', '13', '30', null, '', '12', 'Atlanta ', 'east', '');
INSERT INTO `teams` VALUES ('30', 'Nets', '22', '23', null, '', '7', 'Brooklyn ', 'east', null);
