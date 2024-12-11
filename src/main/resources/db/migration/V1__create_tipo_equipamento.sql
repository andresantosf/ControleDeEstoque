CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE tb_tipo_equipamento (
    id UUID DEFAULT gen_random_uuid() Primary Key,
    nome_tipo_equipamento Varchar(100) NOT NULL,
    date TIMESTAMP NOT NULL
)