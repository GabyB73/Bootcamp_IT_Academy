# 🚀 Sprint 4 Tasca 1 Nivel 2: Introducción a Spring y Gradle

---

## 📄 Descripción

Proyecto de introducción al framework Spring Boot utilizando **Gradle** como gestor de dependencias.  
Se crea una pequeña API REST que responde a peticiones HTTP GET con dos métodos que reciben parámetros vía `RequestParam` y `PathVariable`.

El servidor escucha en el puerto `9001` y devuelve saludos personalizados.

---

## 🎯 Objetivos

- Familiarizarse con el protocolo HTTP.
- Primer contacto con Spring Boot y creación de APIs REST.
- Uso básico de Gradle para gestión de dependencias y comandos.
- Manejar parámetros en rutas HTTP con `RequestParam` y `PathVariable`.
- Uso de Postman para probar la API.

---

## 💻 Tecnologías utilizadas

- **Java 17**
- **Spring Boot** (última versión estable)
- **Gradle** (gestor de dependencias)
- **IntelliJ IDEA**
- **Postman** (para pruebas HTTP)

---

## 📋 Requisitos

- Java JDK 17 instalado
- Gradle instalado y configurado en el sistema
- IntelliJ IDEA o Eclipse
- Postman o cualquier cliente HTTP para probar la API

---

## 📁 Estructura del proyecto

```bash
src/
└── main/
    └── java/
        └── cat/
            └── itacademy/
                └── s04/
                    └── t01/
                        └── n02/
                            └── controller/
                                └── HelloWorldController.java
resources/
└── application.properties  (configura server.port=9001)
build.gradle
```

---

## 🚀 Funcionalidades

- Endpoint GET `/HelloWorld` que acepta parámetro `nombre` como `RequestParam` (por defecto "UNKNOWN").  
  Ejemplo:
    - [http://localhost:9001/HelloWorld](http://localhost:9001/HelloWorld)
    - [http://localhost:9001/HelloWorld?nombre=Gabriela](http://localhost:9001/HelloWorld?nombre=Gabriela)

- Endpoint GET `/HelloWorld2/{nombre}` que acepta parámetro opcional `nombre` como `PathVariable`.  
  Ejemplo:
    - [http://localhost:9001/HelloWorld2](http://localhost:9001/HelloWorld2)
    - [http://localhost:9001/HelloWorld2/Gabriela](http://localhost:9001/HelloWorld2/Gabriela)

Ambos métodos devuelven:  
`"Hola, " + nombre + ". Estás ejecutando un proyecto Gradle"`

---

## 🧰 Comandos Maven importantes

Desde la terminal, en el directorio del proyecto, se pueden ejecutar:

- `gradle build` — Compila el proyecto
- `gradle assemble` — Empaqueta el proyecto
- `gradle clean` — Limpia los archivos compilados
- `gradle bootRun` — Ejecuta la aplicación Spring Boot

> También puedes usar `./gradlew` en lugar de `gradle` si estás en Linux/Mac o `gradlew.bat` en Windows.

---
## 🛠️ Instalación

1. Clona el repositorio:  
   `git clone https://github.com/GabyB73/Sprint4Tasca1Nivel2.git`
2. Abre el proyecto en IntelliJ o Eclipse.
3. Asegúrate de que el archivo `build.gradle` está presente y actualizado.

---

## ▶️ Ejecución

- Ejecuta el siguiente comando desde la raíz del proyecto para iniciar la aplicación:  
  `gradle bootRun`

- Una vez iniciada, accede a las URLs en Postman o navegador:
    - [http://localhost:9001/HelloWorld](http://localhost:9001/HelloWorld)
    - [http://localhost:9001/HelloWorld?nombre=Gabriela](http://localhost:9001/HelloWorld?nom=Gabriela)
    - [http://localhost:9001/HelloWorld2](http://localhost:9001/HelloWorld2)
    - [http://localhost:9001/HelloWorld2/Gabriela](http://localhost:9001/HelloWorld2/Gabriela)

---

## 🔗 Recursos utilizados

1. [Baeldung: Spring RequestParam](https://www.baeldung.com/spring-request-param)
2. [Baeldung: Spring Optional Path Variables](https://www.baeldung.com/spring-optional-path-variables)
3. [Baeldung: RequestParam vs PathVariable](https://www.baeldung.com/spring-requestparam-vs-pathvariable)

---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy  

