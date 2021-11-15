INSERT INTO funcionario(id, nome, email, senha, usuario)
VALUES (1L, 'Marcos', 'marcos@gmail.com', '$2a$12$47RX.GQFDLFKi0IJnR6wFelI98dTE/.cD.T3GVwyNYfiL7dkZWaE.', 'marcos'),
       (2L, 'Bruno', 'bruno@gmail.com', '$2a$12$47RX.GQFDLFKi0IJnR6wFelI98dTE/.cD.T3GVwyNYfiL7dkZWaE.', 'bruno'),
       (3L, 'Eugenio', 'eugenio@gmail.com', '$2a$12$47RX.GQFDLFKi0IJnR6wFelI98dTE/.cD.T3GVwyNYfiL7dkZWaE.', 'eugenio');

INSERT INTO vaga(codigo, ocupada, tipo_vaga)
VALUES ('A01', FALSE, 1),
       ('A02', TRUE, 2),
       ('A03', TRUE, 3);
