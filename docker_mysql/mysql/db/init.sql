CREATE DATABASE sample_db;
use sample_db;

CREATE TABLE users (
  id int(10) unsigned not null auto_increment,
  firstName varchar(255) not null,
  lastName varchar(255) not null,
  mail varchar(255) not null,
  phoneNumber varchar(255) not null,
  user datetime not null default current_timestamp,
  varchar varchar(255) not null,
  updated_time datetime not null default current_timestamp on update current_timestamp,
  primary key (id)
);