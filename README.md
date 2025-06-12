# 🚨 Sprint 1 - Tasca3 : Java Collections - Nivel 1/2/3

---

## 📄 Descripción

Esta tarea tiene como objetivo familiarizarse con el uso de las **Java Collections** (`ArrayList`, `HashSet`, `HashMap`, etc.) para facilitar su correcta aplicación en futuras implementaciones.

Todos los ejercicios han sido desarrollados utilizando IntelliJ IDEA en un proyecto Java gestionado con Maven.


---

## 🎯 Objetivos

- Comprender y aplicar las principales colecciones de Java.
- Identificar sus características (ordenación, duplicados, rendimiento).
- Utilizar `Iterator` y `ListIterator`.
- Implementar ordenación personalizada y evitar duplicados.
- Leer y escribir en archivos usando colecciones.
- Trabajar con estructuras más complejas como menús interactivos y archivos CSV.

---

## 💻 Tecnologías Utilizadas

- Java 16 (OpenJDK 16.0.2)
- IntelliJ IDEA
- Maven
- Git

---

## 📋 Requisitos

- Java JDK 16.0.2
- IntelliJ IDEA o Eclipse
- Maven instalado (`v3.9.4` o superior)
- Git (opcional, para clonar el repositorio)

---

## 📁 Estructura del Proyecto

```bash
src/  
└── main/  
└── java/  
├── N1Ejercicio1/ → Clase Month y manipulación con ArrayList y HashSet  
├── N1Ejercicio2/ → Inversión de listas usando ListIterator  
├── N1Ejercicio3/ → Juego de países y capitales con HashMap y manejo de archivos  
├── N2Ejercicio1/ → Clase Restaurant con HashSet evitando duplicados exactos  
├── N2Ejercicio2/ → Ordenación personalizada de objetos Restaurant  
└── N3Ejercicio1/ → Gestión y ordenación de personas desde archivo CSV con menú interactivo

resources/  
├── ArchivoCSV.csv → Archivo CSV con datos de personas  
├── clasificacion.txt → Archivo para guardar puntuaciones del juego de capitales  
└── countries.txt → Archivo con países y capitales usados en el juego
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1

#### 1. `Month.java` y uso de `ArrayList` / `HashSet`
- Crear una clase `Month` con atributo `name`.
- Crear un `ArrayList` con 11 meses (sin "Agosto") y luego insertarlo en su posición correspondiente para mantener el orden.
- Convertirlo en un `HashSet` asegurando que no se permiten duplicados.
- Recorrer la lista con un bucle `for` y con un `Iterator`.

#### 2. Inversión de listas con `ListIterator`
- Crear una `List<Integer>` con elementos.
- Crear una segunda lista e insertar los elementos de la primera en orden inverso usando `ListIterator`.

#### 3. Juego de países y capitales con `HashMap`
- Leer un archivo `countries.txt` con países y capitales.
- Mostrar un país aleatorio y pedir la capital al usuario.
- Contabilizar los aciertos en una puntuación sobre 10.
- Guardar la puntuación en un archivo `classificacio.txt`.

---

### 🔸 Nivel 2

#### 1. `Restaurant.java` con `HashSet`
- Clase `Restaurant` con `nombre` y `puntuación`.
- Evitar duplicados si el nombre y la puntuación coinciden (permitir mismos nombres con distinta puntuación).

#### 2. Ordenación personalizada de restaurantes
- Implementar ordenación por nombre y puntuación en orden descendente.

---

### 🔺 Nivel 3

#### 1. Aplicación con menú y ordenación de personas
- Leer un archivo CSV con campos: `nombre`, `apellido`, `DNI`.
- Crear clase `Persona` con esos atributos.
- Mostrar un menú para introducir personas y ordenarlas según:
    - Nombre (A-Z y Z-A)
    - Apellido (A-Z y Z-A)
    - DNI (ascendente y descendente)

---

## 🛠️ Instalación

1. Clona el repositorio:

   `git clone https://github.com/GabyB73/Sprint1Tasca3.git`

2. Abre el proyecto en IntelliJ o Eclipse.

3. Si utilizas Maven, asegúrate de que el archivo `pom.xml` está presente y actualizado.


---

## ▶️ Ejecución

- Cada subcarpeta contiene una clase `Main` para ejecutar los ejercicios de forma individual.

---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy


---
