# 🚨 Sprint 1 - Tasca 2: Exceptions - Nivel 1/2/3

---

## 📄 Descripción

Este proyecto tiene como objetivo aplicar el manejo de excepciones en Java para desarrollar código robusto y seguro. A lo largo de los tres niveles, se implementan excepciones personalizadas, el control de errores en entrada de datos, y un sistema completo de gestión de reservas en un cine.

---

## 🎯 Objetivos

- Comprender y aplicar el uso de **excepciones estándar y personalizadas** en Java.
- Mejorar la robustez del código mediante la gestión adecuada de errores.
- Implementar patrones de diseño orientados a objetos junto con control de excepciones.
- Desarrollar una aplicación realista de reserva de butacas con validaciones.

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
Sprint1Tasca2/
│
├── N1Ejercicio1/       → Gestión de productos y cálculo de ventas con excepciones
├── N2Ejercicio1/       → Clase Entrada con validación robusta del input de usuario
└── N3Ejercicio1/       → Sistema de reserva de butacas en cine con control de errores
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1 - Excepciones básicas y personalizadas

- Clase `Producto` y `Venta` para representar productos y una venta.

- Excepción personalizada `VentaVaciaException` si no hay productos.

- Captura de `IndexOutOfBoundsException`.


### 🔹 Nivel 2 - Validación de entrada

- Clase `Entrada` con métodos estáticos como `leerInt()`, `leerFloat()`, `leerSiNo()`, etc.

- Control de excepciones como `InputMismatchException` y personalizadas.

- Reintento de lectura de datos hasta que el usuario introduce un valor válido.


### 🔹 Nivel 3 - Sistema de cine

- Clases `Cine`, `Butaca` y `GestionButaca`.

- Lógica completa para:

    - Reservar/anular butacas.

    - Ver butacas reservadas por persona.

    - Validaciones con excepciones como `ExcepcionButacaOcupada`, `ExcepcionFilaIncorrecta`, etc.

- Menú interactivo en consola para la gestión de reservas.


---

## 🛠️ Instalación

1. Clona el repositorio:

   `git clone https://github.com/GabyB73/Sprint1Tasca2.git`

2. Abre el proyecto en IntelliJ o Eclipse.

3. Si utilizas Maven, asegúrate de que el archivo `pom.xml` está presente y actualizado.


---

## ▶️ Ejecución

- Cada subcarpeta contiene una clase `Main` para ejecutar los ejercicios de forma individual.

- Puedes probar el sistema de reservas accediendo al nivel 3 y ejecutando `Main` desde `Cine`.


---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy

---
