CREATE TABLE autores (
  id bigint auto_increment PRIMARY KEY NOT NULL,
  nome varchar(100) NOT NULL,
  email varchar(100) NOT NULL,
  data_nascimento date NOT NULL,
  mini_curriculo varchar(255) NOT NULL
);