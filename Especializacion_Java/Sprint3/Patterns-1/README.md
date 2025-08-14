# 🚨 Sprint 3 - Tasca 1 : Patterns Nivel 1/2/3

---

## 📄 Descripción

En esta tarea trabajamos con tres de los patrones de diseño más utilizados en desarrollo de software: **Singleton**, **Abstract Factory** y **Command**.

Cada uno se aplica a un ejercicio concreto, permitiendo comprender su funcionamiento mediante ejemplos prácticos en Java.  
El objetivo es reforzar la capacidad de identificar y aplicar estos patrones para lograr un software más estructurado, reutilizable y escalable.

---

## 🎯 Objetivos

- Comprender la importancia del uso de patrones de diseño en el desarrollo de software.
- Implementar y aplicar correctamente los patrones Singleton, Abstract Factory y Command.
- Diseñar soluciones reutilizables utilizando principios de orientación a objetos.

---

## 💻 Tecnologías Utilizadas

- **Java 16 (OpenJDK 16.0.2)**
- **IntelliJ IDEA** – Entorno de desarrollo recomendado.
- **Maven** – Para la gestión de dependencias y compilación.
- **Git** – Para control de versiones y organización del proyecto.
---

## 📋 Requisitos

- Java JDK 16.0.2
- IntelliJ IDEA o Eclipse
- Maven instalado (`v3.9.4` o superior)
- Git (opcional, solo si se desea clonar el repositorio desde GitHub).

---

## 📁 Estructura del Proyecto

```bash
Sprint3Tasca1/
│
├── N1Ejercicio1/       → Patrón Singleton (comando Undo)
├── N2Ejercicio1/       → Patrón Abstract Factory (gestor de direcciones y teléfonos)
└── N3Ejercicio1/       → Patrón Command (parking de vehículos)
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1  – Singleton

- Se implementa una clase `Undo` que guarda una lista de comandos introducidos.
- La clase sigue el patrón Singleton, garantizando una única instancia accesible globalmente.
- Se puede añadir, eliminar y listar comandos desde la clase `Main`.
 ---

### 🔸 Nivel 2 – Abstract Factory

- Se construye un gestor de agenda para direcciones y teléfonos internacionales.
- Mediante el patrón Abstract Factory se encapsula la creación de objetos según el país.
- Permite una fácil escalabilidad para distintos formatos internacionales.

---

### 🔺 Nivel 3 – Command

- Se simula un parking con 4 vehículos: coche, bicicleta, avión y barco.
- Cada vehículo implementa comandos de `arrancar`, `acelerar` y `frenar`.
- El patrón Command encapsula estas acciones permitiendo una gestión flexible de operaciones.

---

## 🛠️ Instalación

1. Clona el repositorio:  
   `git clone https://github.com/GabyB73/Sprint3Tasca1.git`
2. Abre el proyecto en IntelliJ o Eclipse.
3. Si utilizas Maven, asegúrate de que el archivo `pom.xml` está presente y actualizado.

---

## ▶️ Ejecución

- Cada carpeta de nivel contiene una clase `Main` desde la cual se puede ejecutar el patrón correspondiente y comprobar su funcionamiento de forma aislada.

---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy


---
