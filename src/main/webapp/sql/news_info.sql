/*
Navicat MySQL Data Transfer

Source Server         : app
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : app

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2015-12-01 19:54:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for news_info
-- ----------------------------
DROP TABLE IF EXISTS `news_info`;
CREATE TABLE `news_info` (
  `ID` varchar(40) NOT NULL,
  `TITLE` text,
  `AUTHOR` varchar(20) DEFAULT NULL,
  `DESCRIPTION` text,
  `FILENAME` varchar(50) DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `CONTENT` longtext,
  `STATUS` varchar(1) DEFAULT NULL,
  `DELETE_FLAG` varchar(1) DEFAULT NULL,
  `MODIFY_USER_ID` varchar(40) DEFAULT NULL,
  `LAST_MODIFY_DATE` datetime DEFAULT NULL,
  `COVER` varchar(200) DEFAULT NULL COMMENT '新闻封面',
  `VIEW_COUNT` int(11) DEFAULT NULL COMMENT '浏览人数',
  `NEWTYPE_ID` varchar(40) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_info
-- ----------------------------
INSERT INTO `news_info` VALUES ('00f0e815-2314-49b2-b619-0c0e7b661f50', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '1', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('01cbd7b1-b43f-4045-85c2-ae28d2405d30', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '1', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('0351a2bb-9e2c-4cec-9a1e-47adadb58238', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '1', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('04099c7a-f920-4142-95ed-5ce44cdc5f18', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('0551acb1-faa6-46f7-a390-205f08858a67', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('0bc5ee93-8950-42c3-9cf8-74a68fbe1904', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('0d00f5b3-4be0-4e96-bb25-d8bd96975ef7', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('0e971b1e-946f-4eac-9df0-870038e59a8a', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'Y', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('1', 'IS反恐', 'allen', '俄军打击IS', null, '2015-11-24 17:18:19', null, '1', null, null, null, null, null, '');
INSERT INTO `news_info` VALUES ('10f1fa55-2222-4005-9170-e272b295f5fe', 'rgerwg', 'grg', 'gerg4wg', null, '2015-11-19 00:00:00', null, '1', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('11184b1b-091a-459a-84d3-0b4733413558', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('1607920d-458d-4eb5-8b28-bb4055fd4ca5', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('177c881a-53aa-45d3-bff5-00328bea2633', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('2', '热歌', 'buguoduan', '管委会而替换完', null, '2015-11-24 17:18:24', null, '0', null, null, null, null, null, '');
INSERT INTO `news_info` VALUES ('2d391dd1-725a-4666-81f8-29f90287eb3d', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('36329394-8ce2-4b68-a42b-f4e72a8046f5', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('5708ca5c-b83e-4d8d-b49a-e5c85c951aa5', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('58872174-f3c1-403d-b004-20ac8f9376d0', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('60f5ff71-8150-4da7-8ff7-28d7446a9365', '个人化', '个人', '个任务', null, '2015-11-11 00:00:00', null, '0', 'Y', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('6a569c7e-545c-4396-8472-91f19c0eda2c', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('6a5af143-40cc-4721-8192-7af737cb02a6', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('700f61c6-c1e8-4964-a70a-8d79e8bf04d9', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('79005545-739e-4aeb-b187-81de32dbbace', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('7b0042fe-80a2-47da-81c9-3cdd8c198166', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('7eea88da-fb48-4a35-949c-76793b51f1e9', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('801bf43d-0821-4904-ab0f-3065f1db87d4', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('978f1023-30d9-4898-88ea-ac11e30d1841', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('a0fb6458-d0bd-4121-8a2e-1c30ebe0cc57', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('a7266ebc-5975-4a3e-977a-ecf12aa80cad', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('c56b2848-d9a8-46c1-a2a2-17fd05af729b', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('c5f7fb0c-18c1-4a3a-a6d5-fd7069fb0d8c', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('cd7b4b69-9674-4c82-b619-ad0da5a6b969', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('cdd7c8b5-683d-4bab-aad5-3760233ff602', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('db68d4bb-74b2-413e-9b04-46a5a1054344', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('de052568-cb0c-4c43-b4d4-bf2f98a7301e', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('e13f69aa-b0af-4bf4-9c6f-f0d0b4401939', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('e704871d-bcf4-418c-82d6-adeac22818e4', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('e93045f8-f319-4840-8475-4673e907102c', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
INSERT INTO `news_info` VALUES ('ee3479fb-50a1-4080-87e4-2f538911edf6', '发到本规定', '二姑夫', '分', null, '2015-11-27 00:00:00', null, '0', 'N', null, null, null, '0', '0');
