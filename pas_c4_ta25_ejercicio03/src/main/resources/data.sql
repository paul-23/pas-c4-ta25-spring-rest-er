DROP TABLE IF EXISTS cajas;
DROP TABLE IF EXISTS almacenes;

CREATE TABLE almacenes(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	lugar VARCHAR(100),
	capacidad INT
);

CREATE TABLE cajas(
	num_referencia CHAR(5) NOT NULL PRIMARY KEY,
	contenido VARCHAR(100),
	valor INT,
	almacen INT,
	FOREIGN KEY (almacen) REFERENCES almacenes(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO almacenes(lugar, capacidad) VALUES ('Madrid', 1000);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Barcelona', 1500);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Valencia', 2000);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Sevilla', 800);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Reus', 1200);

INSERT INTO cajas(num_referencia, contenido, valor, almacen) VALUES ('A001', 'Instrumentos musicales', 50, 1);
INSERT INTO cajas(num_referencia, contenido, valor, almacen) VALUES ('B002', 'Ropa', 100, 2);
INSERT INTO cajas(num_referencia, contenido, valor, almacen) VALUES ('C003', 'Electrodomésticos', 500, 3);
INSERT INTO cajas(num_referencia, contenido, valor, almacen) VALUES ('D004', 'Joyería', 1000, 4);
INSERT INTO cajas(num_referencia, contenido, valor, almacen) VALUES ('E005', 'Herramientas', 250, 5);