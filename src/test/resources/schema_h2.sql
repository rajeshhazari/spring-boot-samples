 DROP TABLE IF EXISTS APPUSERS CASCADE;
 DROP TABLE IF EXISTS appusers_auth;
 DROP TABLE IF EXISTS authorities_master;
 CREATE TABLE APPUSERS(
  userid identity not null auto_increment PRIMARY KEY ,
  username VARCHAR(100) not null unique ,
  password VARCHAR(100) not null,
  email VARCHAR(100) not null unique
);

CREATE TABLE "appusers_auth" (
 auth_user_id identity not null auto_increment PRIMARY KEY  ,
 userid BIGINT NOT NULL ,
 username text,
 email text NOT NULL,
 role_id VARCHAR(50) NOT NULL,
 updated_time timestamp default CURRENT_TIMESTAMP
);
CREATE TABLE "authorities_master" (
 id identity not null auto_increment PRIMARY KEY ,
 role_id VARCHAR(50) unique,
 roledesc VARCHAR(400)
);

--insert into APPUSERS (username, password, email) values ('test1', 'admin321', 'test1@mail.com');
--insert into appusers_auth (userid,username,email,role_id) values (1,'test1','test1@mail.com','ROLE_BASIC_USER');
--insert into authorities_master (role_id,roleDesc) values ('ROLE_BASIC_USER','Default role for any user');

