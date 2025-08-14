DROP DATABASE IF EXISTS spotify;
CREATE DATABASE spotify CHARACTER SET utf8mb4;
USE spotify;

CREATE TABLE usuario (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	email VARCHAR(50),
	contrasenia VARCHAR(20),
    nombre VARCHAR(50),
    fecha_nacimiento DATE,
    genero ENUM ("Femenino", "Masculino", "No binario", "Género fluido", "Transgénero", "Agénero", "Otros", "Prefiero no decir") NOT NULL,
    pais VARCHAR(45),
    cod_postal VARCHAR(10),
    tipo ENUM("Free","Premium")
    
);

CREATE TABLE suscripcion (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fecha_inicio DATE NOT NULL,
    fecha_renovacion DATE NOT NULL,
    forma_pago ENUM("Tarjeta","Paypal") NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE forma_de_pago (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	numero_tarjeta VARCHAR(20) NOT NULL,
    mes_anio_caducidad DATE NOT NULL,
    codigo_seguridad VARCHAR(5),
    nombre VARCHAR(20) NOT NULL,
	usuario_id INT NOT NULL,
    suscripcion_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (suscripcion_id) REFERENCES suscripcion(id)
);

CREATE TABLE tarjeta_credito (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    numero_tarjeta VARCHAR(20) NOT NULL,
    fecha_caducidad DATE NOT NULL,
    codigo_seguridad VARCHAR(5) NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)

);

CREATE TABLE paypal (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario_paypal VARCHAR(20) NOT NULL,
	usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE pago (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fecha_pago DATE NOT NULL,
    num_orden VARCHAR (20) NOT NULL UNIQUE,
    total VARCHAR (20) NOT NULL,
	usuario_id INT NOT NULL,
    suscripcion_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
	FOREIGN KEY (suscripcion_id) REFERENCES suscripcion(id)
);

CREATE TABLE playlist (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	titulo VARCHAR(50),
    num_canciones INT NOT NULL,
    fecha_creacion DATETIME,
	estado ENUM("Activas","Borradas"),
    usuario_id INT NOT NULL,
    fecha_eliminacion DATETIME,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE lista_compartida (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR (50) NOT NULL,
    fecha DATETIME NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE cancion_lista_compartida (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cancion_id INT NOT NULL,
    lista_compartida_id INT NOT NULL,
    FOREIGN KEY (cancion_id) REFERENCES cancion(id),
    FOREIGN KEY (lista_compartida_id) REFERENCES lista_compartida(id)
    
);

CREATE TABLE album (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR (50),
    anio_publicacion VARCHAR (10),
    imagen_portada VARCHAR (200),
    artista_id INT NOT NULL,
    FOREIGN KEY (artista_id) REFERENCES artista(id)

);

CREATE TABLE cancion (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR (50) NOT NULL,
    duracion INT (10) NOT NULL,
    num_reproduccion INT (10) NOT NULL,
    album_id INT NOT NULL,
    FOREIGN KEY (album_id) REFERENCES album(id)
    
);

CREATE TABLE artista (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (50),
    imagen_artista VARCHAR (50)
);


CREATE TABLE cancion_playlist (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	cancion_id INT NOT NULL,
	playlist_id INT NOT NULL,
	FOREIGN KEY (cancion_id) REFERENCES cancion(id),
	FOREIGN KEY (playlist_id) REFERENCES playlist(id)
);

CREATE TABLE usuario_artista (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    artista_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (artista_id) REFERENCES artista(id)
);

CREATE TABLE usuario_album (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    album_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (album_id) REFERENCES album(id)
);

CREATE TABLE usuario_cancion (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    cancion_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (cancion_id) REFERENCES cancion(id)
);

CREATE TABLE usuario_playlist (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    playlist_id INT NOT NULL,
    fecha_compartido DATETIME,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (playlist_id) REFERENCES playlist(id)
);

