CREATE TABLE livros (
  id bigint auto_increment PRIMARY KEY NOT NULL,
  titulo varchar(100) NOT NULL,
  data_lancamento date NOT NULL,
  numero_paginas int NOT NULL
);