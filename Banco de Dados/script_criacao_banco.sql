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

DELIMITER $$

CREATE OR REPLACE FUNCTION buscar_telefone_id(telefone_numero VARCHAR(20))
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE telefone_id INT;

    -- Usando LIKE para buscar números de telefone que contenham o número informado
    SELECT id INTO telefone_id
    FROM telefones
    WHERE numero LIKE CONCAT('%', telefone_numero, '%')  -- % garante que qualquer parte do número será encontrada
    LIMIT 1;

    RETURN telefone_id;
END $$

DELIMITER ;


INSERT INTO telefones (numero) VALUES ('(75) 99199-2950');

SELECT buscar_telefone_id('9919');

SELECT buscar_telefone_id('(75) 99199-2950');

DELETE FROM telefones WHERE id = 1;

