# 🚨 Sprint 2 - Tasca 4: MongoDB-Queries Nivel 1/2/3

---

## 📄 Descripción

En esta tarea se realizan diversas consultas NoSQL sobre una colección de restaurantes de Nueva York.  
El objetivo es aprender a consultar documentos en una base de datos MongoDB utilizando diferentes operadores de filtrado, proyección, ordenación y expresiones regulares.

Se abordan más de 30 consultas con distintos niveles de dificultad, desde filtros simples hasta combinaciones complejas de condiciones.


---

## 🎯 Objetivos

- Aprender a realizar consultas con MongoDB sobre documentos JSON.
- Utilizar operadores como `$gt`, `$lt`, `$in`, `$regex`, `$and`, `$or`, `$not`, etc.
- Trabajar con proyecciones de campos específicos.
- Filtrar y ordenar documentos embebidos y arrays.
- Familiarizarse con búsquedas basadas en condiciones geográficas, cadenas y tipos de datos.

---

## 💻 Tecnologías Utilizadas

- **MongoDB Server v7.0.2** – Motor de base de datos NoSQL.
- **MongoDB Compass v1.42.0** – Herramienta visual para consultar y gestionar bases de datos MongoDB.
- **Git** – Para el control de versiones del proyecto.
- **JavaScript** – Para definir las consultas en un archivo `.js`.

---

## 📋 Requisitos

- Tener instalado:
  - MongoDB Server (https://www.mongodb.com/try/download/community)
  - MongoDB Compass (opcional, para entorno visual)
- Git (opcional, si deseas clonar el repositorio)

---

## 📁 Estructura del Proyecto

```bash
MongoDB_Queries/
│
├── queries_restaurantes.js    # Consultas realizadas sobre la colección restaurants
├── restaurants.json           # Datos JSON importables a MongoDB
└── README.md
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1 

- Al menos **17 consultas** correctas.
- Incluye filtros por campos simples como `borough`, `cuisine`, `score`, `grades`, etc.

---

### 🔸 Nivel 2 

- Entre **17 y 25 consultas** realizadas correctamente.
- Incluye operadores combinados, uso de expresiones regulares, condiciones por posición de arrays, tipos de datos, y valores geográficos.

---

### 🔺 Nivel 3

- Más de **25 consultas** completadas.
- Uso de condiciones complejas, combinaciones sin `$and`, ordenaciones dobles y filtros por tipo.

---

## 🛠️ Instalación

1. Clona el repositorio:  
    `git clone https://github.com/GabyB73/MongoDB-Queries.git`
2. Inicia el servidor MongoDB:
```bash
mongod
```

3. Importa los datos:
###### ➤ Opción A: MongoDB Compass

- Conéctate a `mongodb://localhost:27017`
- Crea una base de datos `nyc` y colección `restaurants`
- Usa **"Add Data > Import File"**, selecciona `restaurants.json` como JSON array
###### ➤ Opción B: Línea de comandos

```bash
mongoimport --db nyc --collection restaurants --file restaurants.json --jsonArray
```

---

## ▶️ Ejecución

1. Abre **MongoDB Compass** o conecta con MongoDB desde la terminal con `mongosh`.
2. Carga las consultas desde el archivo `queries_restaurantes.js` o copia las que necesites.
3. Ejecuta las consultas una a una sobre la base de datos `nyc`.
  
---

## 🤝 Contribuciones  
  
Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.  
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy  


---
