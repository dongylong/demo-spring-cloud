DROP TABLE  IF EXISTS `user`;
CREATE TABLE user(
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  username varchar(40),
  name varchar(20),
  age int(3),
  balance decimal(10,2),
  primary key(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';