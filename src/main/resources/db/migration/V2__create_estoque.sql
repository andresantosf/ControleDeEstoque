CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE tb_equipamento (
    id UUID DEFAULT gen_random_uuid() Primary Key,
    nome_do_equipamento Varchar(100) NOT NULL,
    numero_de_serie integer NOT NULL,
    estoque_id UUID,
    FOREIGN KEY (estoque_id) REFERENCES tb_tipo_equipamento(id) ON DELETE CASCADE,
    date TIMESTAMP NOT NULL
)