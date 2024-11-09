CREATE DATABASE trotebuster;
USE trotebuster;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    nome_usuario VARCHAR(255) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE telefones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(15) UNIQUE NOT NULL,
    data_registro DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE ocorrencias_trote (
    id INT AUTO_INCREMENT PRIMARY KEY,
    telefone_id INT NOT NULL,
    usuario_id INT,  -- Permitir NULL nesta coluna
    descricao TEXT,
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (telefone_id) REFERENCES telefones(id) ON DELETE CASCADE,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE SET NULL
);

SHOW TABLES;
