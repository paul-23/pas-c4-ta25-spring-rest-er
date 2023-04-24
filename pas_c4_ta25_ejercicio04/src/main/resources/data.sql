DROP TABLE IF EXISTS salas;
DROP TABLE IF EXISTS peliculas;

CREATE TABLE peliculas(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	edad_minima INT
);

CREATE TABLE salas(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	pelicula INT,
	FOREIGN KEY (pelicula) REFERENCES peliculas(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO peliculas(nombre, edad_minima) VALUES ('Los Vengadores', 12);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('La La Land', 7);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('El Gran Hotel Budapest', 16);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('La forma del agua', 18);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Jurassic Park', 14);

INSERT INTO salas(nombre, pelicula) VALUES ('Sala 1', 1);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 2', 2);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 3', 3);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 4', 4);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 5', 5);