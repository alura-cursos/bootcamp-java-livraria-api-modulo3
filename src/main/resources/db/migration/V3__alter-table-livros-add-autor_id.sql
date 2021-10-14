ALTER TABLE livros ADD COLUMN autor_id bigint NOT NULL;
ALTER TABLE livros ADD FOREIGN KEY (autor_id) REFERENCES autores(id);
