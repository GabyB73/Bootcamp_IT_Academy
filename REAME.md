# 🚨 Sprint 1 - Tasca5 : Java Utils - Nivel 1/2/3

---

## 📄 Descripción

Esta tarea tiene como objetivo explorar utilidades clave del lenguaje Java, como la gestión de archivos, la serialización, la configuración mediante propiedades y el cifrado de datos. Además, se busca familiarizarse con el uso de anotaciones.
Todos los ejercicios han sido desarrollados utilizando **IntelliJ IDEA** en un proyecto Java gestionado con Maven.

---

## 🎯 Objetivos

- Comprender cómo acceder y manipular archivos y directorios en Java.
- Practicar la recursividad para recorrer estructuras de carpetas.
- Leer y escribir archivos `.txt` de forma programática.
- Serializar y deserializar objetos Java.
- Aplicar archivos de configuración (`.properties`) para parametrizar métodos.
- Cifrar y descifrar archivos utilizando AES.
- Conocer e implementar anotaciones personalizadas.

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
Sprint1Tasca5/
│
├── N1Ejercicio1/         → Listado alfabético del contenido de un directorio
├── N1Ejercicio2/         → Recorrido recursivo de árbol de directorios con metadatos
├── N1Ejercicio3/         → Guardado del listado de directorios en un archivo .txt
├── N1Ejercicio4/         → Lectura de archivos .txt y visualización en consola
├── N1Ejercicio5/         → Serialización y deserialización de objetos Java
├── N2Ejercicio1/         → Parametrización de rutas mediante archivo .properties
└── N3Ejercicio1/         → Encriptación y desencriptación de archivos con AES
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1

#### 1. Listado alfabético de archivos de un directorio

- Implementación de una clase que recibe por parámetro la ruta de un directorio.
- Muestra por consola el contenido del directorio ordenado alfabéticamente.

#### 2. Listado recursivo con información de archivos

- Ampliación del ejercicio anterior para recorrer el árbol de directorios de forma recursiva.
- En cada nivel, muestra:
    - Nombre del archivo o directorio.
    - Tipo (`D` para directorio, `F` para archivo).
    - Fecha de última modificación.
- La salida mantiene orden alfabético dentro de cada nivel.
#### 3. Guardar listado en archivo

- En lugar de mostrar los resultados en consola, se escriben en un archivo de texto (`.txt`).
#### 4. Lectura de archivo

- Implementación de una clase que lee y muestra por consola el contenido de un archivo `.txt`.
#### 5. Serialización y deserialización

- Serializa un objeto Java a un archivo `.ser`.
- Posteriormente, lee ese archivo y deserializa el objeto original.

---

### 🔸 Nivel 2

#### 1. Parametrización con archivo de configuración

- Parametriza el comportamiento del ejercicio 3 del Nivel 1 utilizando un archivo `.properties`.
- Se configuran:
    - El directorio a listar.
    - El nombre y la ruta del archivo de salida.

---

### 🔺 Nivel 3

#### 1. Encriptación y desencriptación de archivos

- Implementación de una utilidad para cifrar y descifrar archivos usando el algoritmo **AES**.
- Se emplea modo **ECB o CBC** con relleno **PKCS5Padding**.
- A pesar de que el ejercicio permite el uso de librerías externas, se ha implementado únicamente con clases estándar de Java (`javax.crypto` no ha sido utilizada en esta ocasión).

---

## 🛠️ Instalación

1. Clona el repositorio:
   `git clone https://github.com/tu-usuario/Sprint1Tasca5.git`

2. Abre el proyecto en IntelliJ o Eclipse.

3. Si utilizas Maven, asegúrate de que el archivo `pom.xml` está presente y actualizado.

---

## ▶️ Ejecución

- Cada subcarpeta contiene una clase `Main` o clase ejecutable con la funcionalidad correspondiente.
- Si se utilizan archivos `.properties`, asegúrate de que estén bien configurados en la ruta esperada.
- Para los ejercicios con encriptación, puedes establecer la clave en una constante o configurarla externamente.

---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy


---
