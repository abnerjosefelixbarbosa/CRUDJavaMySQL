create database if not exists agenda character set utf8mb4;

create table if not exists contatos(
    idcontatos int not null auto_increment,
    nomecontatos varchar(40) not null,
    idadecontatos int not null,
    datacadastro date not null,
    primary key(idcontatos)
)

insert into contatos(nomecontatos,idadecontatos,datacadastro) values (?,?,?)
 

