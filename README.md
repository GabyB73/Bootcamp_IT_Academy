# 🚨 Sprint 2 - Tasca 1: MySQL-Estructura Nivel 1/2/3

---

## 📄 Descripción

Este proyecto consiste en la creación y modelado de bases de datos relacionales usando **MySQL Workbench**.  
Se proponen cuatro ejercicios repartidos en tres niveles de dificultad (óptica, pizzería, YouTube y Spotify), donde se aplican principios de modelado, normalización y relaciones entre entidades del mundo real.  
Cada modelo incluye un archivo `.mwb` que representa visualmente las entidades y relaciones, así como algunas consultas de verificación (`.sql`) en los casos necesarios.

---

## 🎯 Objetivos

- Aprender a modelar bases de datos en un entorno gráfico.
- Comprender las relaciones 1:N y N:M entre entidades.
- Aplicar normalización y buenas prácticas en esquemas SQL.
- Generar modelos físicos a partir de diagramas EER.
- Verificar la integridad de los modelos con consultas SQL.

---

## 💻 Tecnologías Utilizadas

- **MySQL Workbench 8.0 CE** – Para el diseño visual de los modelos EER y generación del SQL.
- **Git** – Para control de versiones y organización del proyecto.

---

## 📋 Requisitos

- MySQL Workbench 8.0 CE (o superior) instalado en el sistema.
- Git (opcional, solo si se desea clonar el repositorio desde GitHub).

---

## 📁 Estructura del Proyecto

```bash
MySQL-Estructura/
│
├── N1Ejercicio1 - Optica/
│   ├── Modelo ER Optica.mwb
│   ├── Modelo ER Optica.png
│   ├── Script Optica.sql
│   ├── query_optica.sql
│
├── N1Ejercicio2 - Pizzeria/
│   ├── Modelo ER Pizzeria.mwb
│   ├── Modelo ER Pizzeria.mwb.bak
│   ├── Modelo ER Pizzeria.mwb.beforefix
│   ├── Modelo ER Pizzeria.png
│   ├── Script pizzeria.sql
│   ├── query_pizzeria.sql
│   
├── N2Ejercicio1 - YouTube/
│   ├── Modelo ER YouTube.mwb
│   ├── Modelo ER YouTube.png
│   ├── Script YouTube.sql
│
├── N3Ejercicio1 - Spotify/
│   ├── Modelo ER Spotify.mwb
│   ├── Modelo ER Spotify.png
│   └── Script Spotify.sql
│
└── README.md
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1 

- **Óptica**: Gestión de proveedores, gafas, clientes, empleados y ventas.
- Consultas incluidas:
    - Total de facturas por cliente en un período.
    - Modelos vendidos por empleado en un año.
    - Proveedores relacionados con gafas vendidas.
- **Pizzería**: Pedidos online con productos categorizados, empleados y reparto.
- Consultas incluidas:
    - Total de bebidas vendidas en una localidad.
    - Pedidos gestionados por un empleado.
    
---

### 🔸 Nivel 2 

- **YouTube**: Modelado simplificado de usuarios, canales, vídeos, comentarios y playlists.
- Relaciones entre likes/dislikes, suscripciones, etiquetas y privacidad de contenidos.

---

### 🔺 Nivel 3

- **Spotify**: Gestión de usuarios (free/premium), pagos, suscripciones, playlists (activas o eliminadas), álbumes, canciones y artistas.
- Incluye historial de pagos, favoritos y colaboraciones en playlists compartidas.

---

## 🛠️ Instalación

1. Clona el repositorio:  
    `git clone https://github.com/tu-usuario/Sprint2Tasca1.git`
2. Abre el proyecto en MySQL Workbench
3. Selecciona **File > Open Model...** y abre cualquiera de los archivos `.mwb`.

> ⚠️ Los archivos `.mwb` están diseñados para abrirse exclusivamente con MySQL Workbench.  
> Si haces clic en "View raw" desde GitHub, el navegador intentará descargarlos o abrirlos con Workbench si lo tienes instalado, como si fuera un ejecutable o un proyecto gráfico.

---

## ▶️ Ejecución

  1. Abre el modelo deseado (`*.mwb`) en MySQL Workbench.
  2. Usa la opción **Database > Forward Engineer** para generar el script SQL correspondiente.
  3. Ejecuta el script generado en tu servidor MySQL para crear la base de datos.
  4. Si el ejercicio incluye un archivo `*.sql` de consultas, ábrelo y ejecútalo para verificar la estructura y relaciones.
  
---

## 🤝 Contribuciones  
  
Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.  
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy  


---
