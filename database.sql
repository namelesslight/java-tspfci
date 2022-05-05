CREATE DATABASE `db_tspfci`;

USE `db_tspfci`;

CREATE TABLE `tb_all_password`(
                                  `all_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户编号',
                                  `all_password` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户密码',
                                  `is_delete` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
                                  `create_time` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
                                  PRIMARY KEY(`all_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_store`(
                           `st_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '店家编号',
                           `st_user_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '账户名',
                           `st_phone` VARCHAR(11) NOT NULL DEFAULT '' COMMENT '电话号码',
                           `st_owner_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '店主姓名',
                           `st_store_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '店名',
                           `st_introduce` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '店面介绍',
                           `st_picture` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '店面图片',
                           `st_location` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '店面地址',
                           `st_lences_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '经营许可证编号',
                           `is_delete` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
                           `create_time` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
                           PRIMARY KEY(`st_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_factory`(
                             `fac_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '厂家编号',
                             `fac_user_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '账户名',
                             `fac_phone` VARCHAR(11) NOT NULL DEFAULT '' COMMENT '电话号码',
                             `fac_store_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '厂名',
                             `fac_store_introduce` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '厂家介绍',
                             `fac_picture` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '厂家图片',
                             `fac_location` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '厂家地址',
                             `fac_lences_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '经营许可证编号',
                             `fac_delete` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
                             `create_time` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
                             PRIMARY KEY(`fac_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_delivery`(
                              `de_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '配送员编号',
                              `de_user_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '账户名',
                              `de_phone` VARCHAR(11) NOT NULL DEFAULT '' COMMENT '电话号码',
                              `de_picture` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '图片',
                              `de_factory_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '配送员对应厂家ID',
                              `de_driving_license` VARCHAR(200) NOT NULL DEFAULT COMMENT '配送员驾驶证图片路径',
                              `de_car_license` VARCHAR(200) NOT NULL DEFAULT COMMENT '车辆行驶证图片路径',
                              `de_car` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '车牌照',
                              `de_delete` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
                              `create_time` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
                              PRIMARY KEY(`de_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_admin`(
                           `ad_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '管理员编号',
                           `ad_user_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '用户名',
                           `ad_user_picture` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '用户头像',
                           `is_delete` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
                           `create_time` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
                           PRIMARY KEY(`ad_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_user_role`(
                               `u_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户编号',
                               `u_role` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '角色等级',
                               `is_delete` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
                               `create_time` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
                               PRIMARY KEY(`u_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_log`(
                         `log_id` INT NOT NULL AUTO_INCREMENT COMMENT '记录自增主键',
                         `log_user` VARCHAR(32) NOT NULL COMMENT '用户对应id',
                         `log_status` VARCHAR(10) NOT NULL COMMENT '操作状态',
                         `log_time` DATETIME NOT NULL DEFAULT NOW() COMMENT '操作时间',
                         PRIMARY KEY(`log_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;