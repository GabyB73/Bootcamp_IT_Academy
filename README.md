# 🚨 Sprint 1 - Tasca 7 : Java Annotations - Nivel 1/2/3

---

## 📄 Descripción

Esta tarea tiene como objetivo profundizar en el uso de **anotaciones en Java**, tanto las integradas como `@Override` o `@Deprecated`, como en la creación de anotaciones personalizadas. También se explora el uso de **Java Reflection** para leer anotaciones en tiempo de ejecución.

Todos los ejercicios han sido desarrollados utilizando IntelliJ IDEA en un proyecto Java gestionado con Maven.

---

## 🎯 Objetivos

- Comprender el funcionamiento de las anotaciones estándar de Java.
- Aplicar `@Override` y `@Deprecated` en contextos apropiados.
- Utilizar `@SuppressWarnings` para gestionar advertencias del compilador.
- Crear anotaciones personalizadas.
- Serializar objetos Java a JSON usando anotaciones propias.
- Leer anotaciones en tiempo de ejecución con Java Reflection.

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
Sprint1Tasca7/
│
├── src/
│   └── main/
│       └── java/
│           ├── N1Ejercicio1/       → Jerarquía de clases Trabajador, Online y Presencial con @Override
│           ├── N1Ejercicio2/       → Métodos @Deprecated y uso de @SuppressWarnings en clase externa
│           ├── N2Ejercicio1/       → Anotación personalizada para serializar objetos a JSON
│           └── N3Ejercicio1/       → Lectura de anotaciones en tiempo de ejecución con Java Reflection
│
├── persona.json                    → Archivo generado tras la serialización del objeto Persona
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1
#### 1. Jerarquía de trabajadores con @Override

- Clase base `Trabajador` con atributos comunes y método `calcularSou()`.
- Subclases `TrabajadorOnline` y `TrabajadorPresencial` sobreescriben `calcularSou()` usando la anotación `@Override`.
- Cada subclase aplica lógica específica:
    - `TrabajadorPresencial`: añade un coste de gasolina (atributo `static`).
    - `TrabajadorOnline`: añade un coste fijo por tarifa plana de Internet (constante).

#### 2. Métodos obsoletos con @Deprecated

- Se añaden métodos `@Deprecated` en las subclases.
- Se invocan desde una clase externa utilizando `@SuppressWarnings("deprecation")` para evitar advertencias del compilador.

---

### 🔸 Nivel 2

#### 1. Anotación personalizada para serialización JSON

- Se crea una anotación que permite serializar un objeto Java a un archivo `.json`.
- La anotación incluye como parámetro el directorio destino del archivo generado.
- Se implementa la lógica que interpreta la anotación y realiza la escritura del archivo.

---

### 🔺 Nivel 3

#### 1. Lectura de anotaciones con Java Reflection

- La anotación del nivel anterior se marca con **retención en tiempo de ejecución** (`@Retention(RetentionPolicy.RUNTIME)`).
- Se utiliza **Java Reflection** para detectar la anotación en tiempo de ejecución y ejecutar la lógica asociada (serialización).
- Se demuestra su funcionamiento desde la clase principal.

---

## 🛠️ Instalación

1. Clona el repositorio:  
   `git clone https://github.com/GabyB73/Sprint1Tasca7.git`
2. Abre el proyecto en IntelliJ o Eclipse.
3. Si utilizas Maven, asegúrate de que el archivo `pom.xml` está presente y actualizado.

---

## ▶️ Ejecución

- Ejecutar `Principal.java` para ver el funcionamiento de la jerarquía de trabajadores y anotaciones estándar.
- Usar `Serializador.java` y `LectorAnotaciones.java` para comprobar el funcionamiento de las anotaciones personalizadas y Reflection.
  
---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy


---
