# 🚀 Sprint 4 - Tasca 1 Nivel 1: Introducción a Spring y Maven

---

## 📄 Descripción

Proyecto de introducción al framework Spring Boot utilizando Maven como gestor de dependencias.  
Se crea una pequeña API REST que responde a peticiones HTTP GET con dos métodos que reciben parámetros vía `RequestParam` y `PathVariable`.

El servidor escucha en el puerto 9000 y devuelve saludos personalizados.

---

## 🎯 Objetivos

- Familiarizarse con el protocolo HTTP.
- Primer contacto con Spring Boot y creación de APIs REST.
- Uso básico de Maven para gestión de dependencias y comandos.
- Manejar parámetros en rutas HTTP con `RequestParam` y `PathVariable`.
- Uso de Postman para probar la API.

---

## 💻 Tecnologías utilizadas

- **Java 17**
- **Spring Boot** (última versión estable)
- **Maven** (gestor de dependencias)
- **IntelliJ IDEA**
- **Postman** (para pruebas HTTP)

---

## 📋 Requisitos

- Java JDK 17 instalado
- Maven instalado y configurado en el sistema
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
                        └── n01/
                            └── controller/
                                └── HelloWorldController.java
resources/
└── application.properties  (configura server.port=9000)
pom.xml
```

---

## 🚀 Funcionalidades

- Endpoint GET `/HelloWorld` que acepta parámetro `nombre` como `RequestParam` (por defecto "UNKNOWN").  
  Ejemplo:
    - [http://localhost:9000/HelloWorld](http://localhost:9000/HelloWorld)
    - [http://localhost:9000/HelloWorld?nombre=Gabriela](http://localhost:9000/HelloWorld?nombre=Gabriela)

- Endpoint GET `/HelloWorld2/{nombre}` que acepta parámetro opcional `nombre` como `PathVariable`.  
  Ejemplo:
    - [http://localhost:9000/HelloWorld2](http://localhost:9000/HelloWorld2)
    - [http://localhost:9000/HelloWorld2/Gabriela](http://localhost:9000/HelloWorld2/Gabriela)

Ambos métodos devuelven:  
`"Hola, " + nombre + ". Estás ejecutando un proyecto Maven"`

---

## 🧰 Comandos Maven importantes

Desde la terminal, en el directorio del proyecto, se pueden ejecutar:

- `mvn compile` — Compila el proyecto
- `mvn package` — Empaqueta el proyecto
- `mvn clean` — Limpia los archivos compilados
- `mvn spring-boot:run` — Ejecuta la aplicación Spring Boot

---
## 🛠️ Instalación

1. Clona el repositorio:  
   `git clone https://github.com/GabyB73/Sprint4Tasca1Nivel1.git`
2. Abre el proyecto en IntelliJ o Eclipse.
3. Asegúrate de que el archivo `pom.xml` está presente y actualizado.

---

## ▶️ Ejecución

- Ejecuta el siguiente comando desde la raíz del proyecto para iniciar la aplicación:  
  `mvn spring-boot:run`

- Una vez iniciada, accede a las URLs en Postman o navegador:

    - [http://localhost:9000/HelloWorld](http://localhost:9000/HelloWorld)
    - [http://localhost:9000/HelloWorld?nombre=Gabriela](http://localhost:9000/HelloWorld?nombre=Gabriela)
    - [http://localhost:9000/HelloWorld2](http://localhost:9000/HelloWorld2)
    - [http://localhost:9000/HelloWorld2/Gabriela](http://localhost:9000/HelloWorld2/Gabriela)

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

