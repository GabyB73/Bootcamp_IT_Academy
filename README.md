# 🚀 Sprint 4 - Tasca 2 Nivel 1:
---

## 📄 Descripción

En esta tarea se desarrolla una API REST usando **Spring Boot** que implementa operaciones **CRUD** sobre una entidad llamada `Fruta`. Esta entidad se persiste en una base de datos **H2** y el proyecto sigue el patrón **MVC**.

Durante la implementación se han puesto en práctica conceptos clave como:

- Uso correcto de los **verbos HTTP**.
- Gestión adecuada de **códigos de estado HTTP (Status Codes)**.
- Configuración y prueba de **endpoints** con Postman.
- Manejo centralizado de errores usando un **GlobalExceptionHandler**.
- Uso de **ResponseEntity** para respuestas más controladas.

---

## 🎯 Objetivos

- HTTP Verbos
- HTTP Headers
- HTTP Status Codes
- CRUD con Spring Boot
- H2

---

## 💻 Tecnologías utilizadas

- **Java 17**
- **Spring Boot** (última versión estable)
- **Maven** (gestor de dependencias)
- **IntelliJ IDEA**
- **Postman** (para pruebas HTTP)
- **H2**

---

## 📋 Requisitos

- Java JDK 17 instalado
- Maven instalado y configurado en el sistema
- IntelliJ IDEA o Eclipse
- Postman o cualquier cliente HTTP para probar la API
- H2

---

## 📁 Estructura del proyecto

```bash
S04T02N01BustamanteGabriela/
├── .idea/
├── .mvn/
├── screenshots/
│   ├── add_fruta.png
│   ├── delete_fruta.png
│   ├── get_all_frutas.png
│   ├── get_one_fruta.png
│   ├── h2_console.png
│   └── update_fruta.png
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── cat/itacademy/barcelonactiva/bustamante/gabriela/s04/t02/n01/S04T02N01BustamanteGabriela/
│   │   │       ├── controllers/
│   │   │       │   └── FrutaController.java
│   │   │       ├── exception/
│   │   │       │   ├── FrutaNotFoundException.java
│   │   │       │   └── GlobalExceptionHandler.java
│   │   │       ├── model/
│   │   │       │   └── domain/
│   │   │       │       └── Fruta.java
│   │   │       ├── repository/
│   │   │       │   └── FrutaRepositorio.java
│   │   │       ├── services/
│   │   │       │   ├── ServicioFruta.java
│   │   │       │   └── ServicioFrutaImpl.java
│   │   │       └── S04T02N01BustamanteGabrielaApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── cat/itacademy/barcelonactiva/bustamante/gabriela/s04/t02/n01/S04T02N01BustamanteGabriela/
│               └── S04T02N01BustamanteGabrielaApplicationTests.java
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## 🚀 Funcionalidades

- ➕ **POST** `/fruta/add`  
  Crea una nueva fruta.
- ✏️ **PUT** `/fruta/update`  
  Actualiza una fruta existente.
- ❌ **DELETE** `/fruta/delete/{id}`  
  Elimina una fruta por su ID.
- 🔍 **GET** `/fruta/getOne/{id}`  
  Obtiene una fruta por ID.
- 📋 **GET** `/fruta/getAll`  
  Lista todas las frutas.

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
   `git clone https://github.com/GabyB73/Sprint4Tasca2Nivel1.git`
2. Abre el proyecto en IntelliJ o Eclipse.
3. Asegúrate de que el archivo `pom.xml` está presente y actualizado.
4. Ejecuta la aplicación con:
```bash
mvn spring-boot:run
```
5.  Accede a la consola H2 (si está habilitada) en:  
    [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## ▶️ Ejecución

Una vez ejecutado, puedes probar los siguientes endpoints en Postman:
```bash
POST    http://localhost:8080/fruta/add
PUT     http://localhost:8080/fruta/update{id}
DELETE  http://localhost:8080/fruta/delete/{id}
GET     http://localhost:8080/fruta/getOne/{id}
GET     http://localhost:8080/fruta/getAll
```

📌 Asegúrate de enviar los datos como JSON en las peticiones POST y PUT.
 
---
### 📸 Capturas de pantalla

####➕ Añadir fruta
![add_fruta](screenshots/add_fruta.png)

####✏️ Actualizar fruta
![update_fruta](screenshots/update_fruta.png)

####❌ Eliminar fruta
![delete_fruta](screenshots/delete_fruta.png)

####🔍 Obtener una fruta
![get_one_fruta](screenshots/get_one_fruta.png)

####📋 Obtener todas las frutas
![get_all_frutas](screenshots/get_all_frutas.png)

####🧪 Consola H2
![h2_console](screenshots/h2_console.png)

---
## 🔗 Recursos utilizados

1- [https://developer.mozilla.org/es/docs/Web/HTTP/Overview](https://developer.mozilla.org/es/docs/Web/HTTP/Overview)
2- [https://www.restapitutorial.com/](https://www.restapitutorial.com/)
3- [https://spring.io/blog/2015/07/14/microservices-with-spring](https://spring.io/blog/2015/07/14/microservices-with-spring)
4- [https://www.bezkoder.com/spring-boot-jpa-h2-example/](https://www.bezkoder.com/spring-boot-jpa-h2-example/)

---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy  

