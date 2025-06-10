# 🚨 Sprint 3 - Tasca 2 : Patterns Nivel 1/2/3

---

## 📄 Descripción

En esta tarea se implementan distintos patrones de diseño en Java, enfocados en la **comunicación entre objetos**, **desacoplamiento** y **transformación de datos**.

El objetivo es desarrollar pequeñas aplicaciones que ejemplifiquen de forma clara el uso de patrones como **Observer**, **Callback** y **Converter**, promoviendo buenas prácticas en la construcción de software modular, reutilizable y mantenible.

---

## 🎯 Objetivos

- Aplicar el patrón **Observer** para la notificación de cambios.
- Implementar **Callbacks** para manejar acciones delegadas entre clases.
- Utilizar el patrón **Converter** para transformar objetos entre modelos.

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
Sprint3Tasca1/
│
├── N1Ejercicio1/       → Patrón Observer (sistema agente de bolsa)
├── N2Ejercicio1/       → Patrón Callback (simulador pasarela de pago)
└── N3Ejercicio1/       → Patrón Converter (conversor de moneda)
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1  – Observer

- Un sistema simula un Agente de Bolsa que **notifica cambios** a varias agencias de Bolsa observadoras.
- Se implementa el patrón **Observer**, donde el objeto Observable mantiene y notifica a sus Observers.
 ---

### 🔸 Nivel 2 – Callback

- Se simula una **pasarela de pago** que recibe distintos métodos de pago (tarjeta, PayPal, cuenta bancaria).
- La lógica de pago es delegada y ejecutada sin que la pasarela conozca su implementación interna.
- Ejemplo claro de uso del patrón **Callback**.

---

### 🔺 Nivel 3 – Converter

- - Implementación de una clase que convierte objetos de un tipo a otro.
- Permite **transformar entidades** entre capas del sistema, usando el patrón **Converter** para separar lógica de presentación, dominio y persistencia.

---

## 🛠️ Instalación

1. Clona el repositorio:  
   `git clone https://github.com/tu-usuario/Sprint3Tasca2.git`
2. Abre el proyecto en IntelliJ o Eclipse.
3. El proyecto está configurado con Gradle Wrapper. Puedes compilar o ejecutar con:
    - `./gradlew build` (Linux/macOS)
    - `gradlew.bat build` (Windows)
---

## ▶️ Ejecución

- Cada carpeta de nivel contiene una clase `Main` desde la cual se puede ejecutar el patrón correspondiente y comprobar su funcionamiento de forma aislada.
- Ejecuta directamente desde tu IDE o con `gradlew run` si está configurado.

---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.

---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy


---
