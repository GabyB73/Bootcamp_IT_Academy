DROP DATABASE IF EXISTS youtube;
CREATE DATABASE youtube CHARACTER SET utf8mb4;
USE youtube;

CREATE TABLE usuario(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	email VARCHAR(50),
	contrasenia VARCHAR(20),
    nombre VARCHAR(50),
    fecha_nacimiento DATE,
    genero ENUM ("Femenino", "Masculino", "No binario", "Género fluido", "Transgénero", "Agénero", "Otros", "Prefiero no decir") NOT NULL,
    pais VARCHAR(45),
    cod_postal VARCHAR(10)
    
);
CREATE TABLE video(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fecha_hora DATETIME NOT NULL,
	titulo VARCHAR(50) NOT NULL,
	descripcion VARCHAR(200) NOT NULL,
	tamanio INT NOT NULL,
	nombre_archivo_video VARCHAR(50) NOT NULL,
	duracion TIME NOT NULL,
	thumbnail VARCHAR(200) NOT NULL,
	num_reproducciones INT NOT NULL,
	num_likes INT NOT NULL,
	num_dislikes INT NOT NULL,
	estado ENUM("Publico","Oculto","Privado") NOT NULL,
	usuario_id INT NOT NULL,
    fecha_hora_publicacion DATETIME NOT NULL,
	FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);
CREATE TABLE canal(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(50),
    descripcion VARCHAR(200),
    fecha_creacion DATETIME

);

CREATE TABLE playlist(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(50),
    fecha_creacion DATETIME,
	estado ENUM("Publico","Privado")
);

 CREATE TABLE comentario(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    texto VARCHAR(500) NOT NULL,
    fecha_hora DATETIME NOT NULL,
    hacer_comentario ENUM("Me gusta","No me gusta") NOT NULL,
    video_id INT NOT NULL,
    FOREIGN KEY (video_id) REFERENCES video(id)
     
 );
 CREATE TABLE etiqueta(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50)
 );
  CREATE TABLE video_etiqueta(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  video_id INT NOT NULL,
  etiqueta_id INT NOT NULL,
  FOREIGN KEY (video_id) REFERENCES video(id),
  FOREIGN KEY (etiqueta_id) REFERENCES etiqueta(id)
  );
  
  CREATE TABLE usuario_comentario(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  usuario_id INT NOT NULL,
  comentario_id INT NOT NULL,
  FOREIGN KEY (usuario_id) REFERENCES usuario(id),
  FOREIGN KEY (comentario_id) REFERENCES comentario(id)
  
  );
  
  CREATE TABLE suscripcion_canal(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  fecha_hora DATETIME NOT NULL,
  usuario_id INT NOT NULL,
  canal_id INT NOT NULL,
  FOREIGN KEY (usuario_id) REFERENCES usuario(id),
  FOREIGN KEY (canal_id) REFERENCES canal(id)
  
  );
  
  CREATE TABLE playlist_video(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  playlist_id INT NOT NULL,
  video_id INT NOT NULL,
  FOREIGN KEY (playlist_id) REFERENCES playlist(id),
  FOREIGN KEY (video_id) REFERENCES video(id)
  
  );
  
 CREATE TABLE like_dislike (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  usuario_id INT NOT NULL,
  video_id INT,
  comentario_id INT,
  tipo ENUM("Like", "Dislike") NOT NULL,
  fecha_hora DATETIME NOT NULL,
  FOREIGN KEY (usuario_id) REFERENCES usuario(id),
  FOREIGN KEY (video_id) REFERENCES video(id),
  FOREIGN KEY (comentario_id) REFERENCES comentario(id)
);
 
