create database joana;
USE joana;
create table pessoa (
cpf INT PRIMARY KEY,
NOME varchar(100)
);
insert into pessoa (cpf, nome) value (121, 'joana');