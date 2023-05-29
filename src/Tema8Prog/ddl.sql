CREATE OR REPLACE USER 'diego'@'localhost' IDENTIFIED BY 'diego';
GRANT ALL ON *.* TO 'diego'@'localhost';

CREATE DATABASE tienda;
USE tienda;

CREATE TABLE producto (
id VARCHAR(10) PRIMARY KEY,
nombre VARCHAR(30),
descripcion VARCHAR(200),
precio INT(11),
pais VARCHAR(30)
);

INSERT INTO producto VALUES (1, 'agua','mineral',4),
 (2,'aceite','girasol',5), (3,'azucar','moreno',3)