DROP TABLE IF EXISTS articulos;
DROP TABLE IF EXISTS fabricantes;

CREATE TABLE fabricantes(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100)
);

CREATE TABLE articulos(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	precio INT,
	codigo_fabricante INT NOT NULL,
	FOREIGN KEY (codigo_fabricante) REFERENCES fabricantes(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO fabricantes(nombre) VALUES ('Intel');
INSERT INTO fabricantes(nombre) VALUES ('AMD');
INSERT INTO fabricantes(nombre) VALUES ('Nvidia');
INSERT INTO fabricantes(nombre) VALUES ('Samsung');
INSERT INTO fabricantes(nombre) VALUES ('Seagate');

INSERT INTO articulos(nombre, precio, codigo_fabricante) VALUES ('Procesador Intel Core i7', 350, 1);
INSERT INTO articulos(nombre, precio, codigo_fabricante) VALUES ('Procesador AMD Ryzen 5', 250, 2);
INSERT INTO articulos(nombre, precio, codigo_fabricante) VALUES ('Tarjeta gráfica Nvidia GeForce RTX 3080', 1000, 3);
INSERT INTO articulos(nombre, precio, codigo_fabricante) VALUES ('Disco duro externo Samsung 1TB', 80, 4);
INSERT INTO articulos(nombre, precio, codigo_fabricante) VALUES ('SSD interno Seagate Barracuda 500GB', 100, 5);