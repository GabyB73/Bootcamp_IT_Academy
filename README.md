# 🚨 Sprint 2 - Tasca 3: MongDB-Estructura Nivel 1/2/3

---
## 📄 Descripción

Este repositorio contiene el modelado de bases de datos NoSQL utilizando MongoDB, correspondiente a los ejercicios de los niveles 1, 2 y 3. Los ejercicios consisten en diseñar estructuras de datos adaptadas a distintos escenarios reales, aplicando buenas prácticas de modelado en MongoDB.

---
## 🎯 Objetivos

- Aprender a **modelar bases de datos NoSQL** con MongoDB.
- Representar relaciones entre documentos utilizando subdocumentos y referencias.
- Utilizar estructuras adecuadas para optimizar consultas y escalabilidad.

---
## 💻 Tecnologías Utilizadas

- **MongoDB 7.0.2** – Base de datos NoSQL orientada a documentos.
- **MongoDB Compass 1.42.0** – Interfaz gráfica para explorar, gestionar y visualizar las colecciones y documentos.
- **JSON / BSON** – Formatos utilizados para definir y manipular los datos.
- **JavaScript (.js)** – Scripts para insertar o estructurar colecciones (cuando corresponde).
- **Git** – Para el control de versiones del proyecto.

---
## 📋 Requisitos

- **MongoDB 7.0.2** – Base de datos NoSQL orientada a documentos.
- **MongoDB Compass 1.42.0** – Interfaz gráfica para explorar, gestionar y visualizar las colecciones y documentos.
- **JSON / BSON** – Formatos utilizados para definir y manipular los datos.
- **JavaScript (.js)** – Scripts para insertar o estructurar colecciones (cuando corresponde).
- **Git** (opcional, si deseas clonar el repositorio)

---
## 📁 Estructura del Proyecto

```bash
MongoDB-Estructura/
│
├── N1Ejercicio1/     # Modelado BBDD Óptica
├── N1Ejercicio2/     # Modelado BBDD Pizzería
├── N2Ejercicio1/     # Modelado BBDD YouTube
└── N3Ejercicio1/     # Modelado BBDD Spotify
│
└── README.md
```

---
## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1 

- **Ejercicio 1 – Óptica Cul d'Ampolla:** Modelado de clientes, empleados, proveedores y gafas.
- **Ejercicio 2 – Pizzería Online:** Modelado de pedidos, productos, tiendas, empleados y clientes.

---
### 🔸 Nivel 2 

- **Ejercicio 1 – YouTube (simplificado):** Modelado de usuarios, vídeos, canales, comentarios y reacciones.

---
### 🔺 Nivel 3

- **Ejercicio 1 – Spotify (simplificado):** Modelado de usuarios (free/premium), playlists, artistas, álbumes y suscripciones.

---
## 🛠️ Instalación

1. Clona el repositorio:  
    `git clone https://github.com/tu-usuario/Sprint2Tasca3.git`
2. Asegúrate de tener instalado:
   - [MongoDB Server](https://www.mongodb.com/try/download/community) (v7.0.2 o compatible)
   - [MongoDB Compass](https://www.mongodb.com/try/download/compass) (v1.42.0 o compatible)

3. Inicia el servidor MongoDB si no está activo:
```bash
mongod
```
   
4. Abre **MongoDB Compass** y conéctate a tu instancia local:
```bash
mongodb://localhost:27017
```
   
5. Importa los datos:
   - Abre cada carpeta del repositorio (`N1Ejercicio1`, `N1Ejercicio2`, etc.).
   - Utiliza la opción **"Import Data"** de Compass en la base de datos correspondiente.
   - Selecciona los archivos `.json` o `.js` de ejemplo que quieras visualizar o probar.

✅ **Sugerencia extra**:  
Si los archivos son `.js` con instrucciones de inserción (`db.collection.insertMany()`...), también puedes ejecutarlos desde la terminal usando la **Mongo Shell** o directamente desde el panel de ejecución de consultas de Compass.

---
## ▶️ Ejecución

1. Abre **MongoDB Compass**.
2. Conéctate a tu servidor local (`mongodb://localhost:27017`).
3. Importa los archivos `.json` incluidos en cada carpeta para ver cómo están modeladas las bases de datos.
4. Explora las colecciones, relaciones y documentos para validar la estructura.
  
---
## 🤝 Contribuciones  
  
Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.  
  
---
## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy  


---
