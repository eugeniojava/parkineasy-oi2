CREATE TABLE funcionario
(
    id      BIGINT PRIMARY KEY AUTO_INCREMENT,
    email   VARCHAR(255) NOT NULL,
    nome    VARCHAR(255) NOT NULL,
    senha   VARCHAR(255) NOT NULL,
    usuario VARCHAR(255) NOT NULL
);
CREATE TABLE vaga
(
    codigo    VARCHAR(255) PRIMARY KEY,
    ocupada   BOOLEAN NOT NULL,
    tipo_vaga INT     NOT NULL
);
