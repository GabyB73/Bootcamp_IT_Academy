# 🚨 Sprint 3 - Tasca 3 : Group_Project

---

## 📄 Descripción

Aplicación Java para gestionar el catálogo y las ventas de una floristería.  
Permite crear una floristería con su inventario de productos (árboles, flores y elementos decorativos), así como registrar compras y generar tickets.  
La persistencia de los datos se realiza mediante archivos `.txt`.

---

## 🎯 Objetivos

- Aplicar principios de programación orientada a objetos en Java.
- Diseñar un sistema modular que permita gestionar productos, stock, ventas y tickets.
- Implementar persistencia de datos mediante archivos de texto.

---

## 💻 Tecnologías Utilizadas

- **Java 19 (OpenJDK 19.0.2)**
- **Gradle 8.2** (mediante Wrapper)
- **IntelliJ IDEA** – Entorno de desarrollo recomendado.
- **Git** – Para control de versiones y organización del proyecto.

---

## 📋 Requisitos

- Java JDK 19.0.2
- IntelliJ IDEA o Eclipse
- Gradle Wrapper incluido en el proyecto
- Git (opcional, solo si se desea clonar el repositorio desde GitHub)

> ⚙️ Este proyecto utiliza **Gradle Wrapper**, por lo tanto **no necesitas instalar Gradle** globalmente.  
> Puedes ejecutar los comandos usando `./gradlew` en Linux/macOS o `gradlew.bat` en Windows.

---

## 📁 Estructura del Proyecto

```bash
Group_Project/
│
├── src/
│   └── main/
│       └── java/
│           └── Floristeria/
│               ├── Client/        → Gestión de la lógica principal de usuario
│               ├── DB/            → Persistencia en archivo TXT
│               ├── Factory/       → Creación de objetos de producto
│               └── Products/      → Definición de productos (Árbol, Flor, Decoración)
│
├── stockProductos.txt             → Archivo de persistencia del stock
├── tickets.txt                    → Archivo con historial de compras
├── README.md
├── build.gradle
└── settings.gradle
```

---

## 🧪 Funcionalidades

- Crear floristería (nombre).
- Añadir productos:
    - Árboles (con altura)
    - Flores (con color)
    - Decoración (madera o plástico)
- Eliminar productos del inventario.
- Mostrar stock detallado por tipo de producto.
- Mostrar stock con cantidades agregadas.
- Calcular y mostrar el valor total del inventario.
- Crear tickets de compra con múltiples productos.
- Listar compras anteriores (tickets).
- Mostrar el total de dinero generado por las ventas.

---

## 🛠️ Instalación

1. Clona el repositorio:  
    `git clone https://github.com/GabyB73/Group_Project.git`
2. Abre el proyecto en IntelliJ o Eclipse.
3. El proyecto está configurado con Gradle Wrapper. Puedes compilar o ejecutar con:
	- `./gradlew build` (Linux/macOS)
	- `gradlew.bat build` (Windows)
 4. Ejecuta la clase `Main` para iniciar la aplicación.
 
---

## ▶️ Ejecución

- La clase `Main` contiene un menú interactivo para acceder a todas las funcionalidades.
- El sistema almacena datos de productos y ventas en archivos `.txt`, que se cargan automáticamente al iniciar.
  
---

## 🤝 Contribuciones  
  
Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.  
  
---

## 👩‍💻 Autores

Desarrollado por
- [Gabriela Bustamante](https://github.com/GabyB73)  
- [Ana García](https://github.com/anagarcialainez)  
- [Juan Moreno](https://github.com/juanmoree)  

Bootcamp de Desarrollo Java - IT Academy  


---
