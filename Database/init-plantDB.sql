CREATE DATABASE IF NOT EXISTS plantDB;

USE plantDB;

CREATE TABLE IF NOT EXISTS plant (
    id BINARY(16) NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    isToxic BOOLEAN,
    isOwned BOOLEAN,
    type VARCHAR(50)
);

INSERT INTO plant (id, name, isToxic, isOwned, type)
VALUES 
  (UNHEX(REPLACE('e0a1e13a-0ef2-4d5c-a41f-f9d0b7d2f0a1', '-', '')), 'Lavande', false, true, 'PLANTE_AROMATIQUE'),
  (UNHEX(REPLACE('af0a1bd3-5eb8-4f9a-982e-09e4f0f885e2', '-', '')), 'Figuier', false, false, 'FRUITIER'),
  (UNHEX(REPLACE('c2b1e2fc-4bb4-4934-a1db-17b65db942fb', '-', '')), 'Aloe Vera', false, true, 'PLANTE_GRASSE'),
  (UNHEX(REPLACE('d7b5babe-77e1-4f6d-9af5-2fc6b207b0e5', '-', '')), 'Digitalis', true, false, 'PLANTE_MEDICINALE'),
  (UNHEX(REPLACE('f5dbeb23-76f6-4f29-bc0b-0657ef55cb29', '-', '')), 'Bambou', false, true, 'ARBRE');
