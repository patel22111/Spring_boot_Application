create database sales;
create table product(
id int(15) auto increment,
name varchar(30) not null,
brand varchar(15) not null,
made_in varchar(15) not null,
price float
);