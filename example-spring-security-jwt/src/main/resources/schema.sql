drop table if exists members cascade;

create table members(
    seq bigint not null auto_increment,
    username varchar(20) not null unique,
    token varchar(80) not null,
    auth enum('USER', 'ADMIN') not null,

    primary key (seq)
);