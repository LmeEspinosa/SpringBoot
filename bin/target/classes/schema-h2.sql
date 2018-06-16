CREATE TABLE Empleado (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    legajo INT AUTO_INCREMENT(127001,1) UNIQUE NOT NULL,
    nombre_apellido VARCHAR(100),
    edad SMALLINT,
    tipoDoc VARCHAR(3),
    nroDoc  INT   
);
