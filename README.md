## Create Database and Database User (MySQL)
create database `springio2016`;
grant all privileges on `springio2016`.* to 'jsug'@'localhost' identified by 'jsug' with grant option;
grant all privileges on `springio2016`.* to 'jsug'@'%' identified by 'jsug' with grant option;