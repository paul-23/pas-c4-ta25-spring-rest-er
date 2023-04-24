DROP TABLE IF EXISTS empleados;
DROP TABLE IF EXISTS departamentos;

CREATE TABLE departamentos(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	presupuesto INT
);

CREATE TABLE empleados(
	dni VARCHAR(8) NOT NULL PRIMARY KEY,
	nombre VARCHAR(100),
	apellidos VARCHAR(255),
	departamento INT,
	FOREIGN KEY (departamento) REFERENCES departamentos(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO departamentos(nombre, presupuesto) VALUES ('Ventas', 100000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('Marketing', 75000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('Recursos Humanos', 50000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('Desarrollo', 150000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('Administración', 100000);

INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('12345678', 'Juan', 'García', 1);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('87654321', 'María', 'Rodríguez', 2);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('45678912', 'Pedro', 'Martínez', 3);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('98765432', 'Luisa', 'Fernández', 4);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES ('32165487', 'Ana', 'Sánchez', 5);