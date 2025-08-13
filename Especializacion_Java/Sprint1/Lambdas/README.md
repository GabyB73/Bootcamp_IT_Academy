# 🚨 Sprint 1 - Tasca 8 : Lambdas - Nivel 1/2/3

---

## 📄 Descripción

Esta tarea tiene como objetivo introducir y practicar los conceptos fundamentales de la **programación funcional en Java**, centrándose en el uso de **lambdas**, **streams** y **functional interfaces** incorporadas desde Java 8.

Se trabajan aspectos clave como el filtrado, transformación y ordenación de colecciones, la construcción de expresiones lambda personalizadas, y el uso de interfaces funcionales para representar operaciones comunes o reutilizables.

Todos los ejercicios han sido desarrollados utilizando IntelliJ IDEA en un proyecto Java gestionado con Maven.


---

## 🎯 Objetivos

- Comprender el paradigma de **programación funcional** en Java a través del uso de **expresiones lambda** y **streams** introducidos en Java 8.
- Aplicar **interfaz funcional** personalizada y predefinida para encapsular comportamientos.
- Utilizar lambdas para realizar operaciones comunes como filtrado, transformación y ordenación sobre colecciones.
- Implementar soluciones más limpias y declarativas en lugar de estructuras imperativas tradicionales.
- Familiarizarse con conceptos como **method references**, **varargs**, y **composición funcional**.
- Fortalecer el pensamiento funcional y la manipulación eficiente de datos mediante la API de Streams de Java.

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
src
└── main
    └── java
        ├── N1Ejercicio1/      → Filtrado de Strings con lambdas simples
        ├── N1Ejercicio2/      → Filtrado con múltiples condiciones
        ├── N1Ejercicio3/      → Impresión con lambda
        ├── N1Ejercicio4/      → Impresión con method reference
        ├── N1Ejercicio5/      → Interfaz funcional para valor de Pi
        ├── N1Ejercicio6/      → Ordenación de Strings por longitud
        ├── N1Ejercicio7/      → Ordenación inversa
        ├── N1Ejercicio8/      → Interfaz funcional para invertir Strings
        ├── N2Ejercicio1/      → Filtrado de nombres con condiciones específicas
        ├── N2Ejercicio2/      → Transformación de lista de números a formato String
        ├── N2Ejercicio3/      → Operaciones aritméticas con lambdas
        ├── N2Ejercicio4/      → Orden, filtrado y transformación de lista mixta
        └── N3Ejercicio1/      → Filtrado y procesamiento de objetos Alumno con lambdas
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1 – Lambdas básicas y Method References

- **Ejercicio 1:** Filtra una lista de Strings y devuelve aquellos que contienen la letra `'o'`.

- **Ejercicio 2:** Extiende el ejercicio anterior filtrando también por longitud mayor a 5 caracteres.

- **Ejercicio 3:** Imprime todos los elementos de una lista de meses del año utilizando una expresión lambda.

- **Ejercicio 4:** Realiza la misma impresión utilizando **method reference**.

- **Ejercicio 5:** Crea una interfaz funcional `PiValue` con un método `getPiValue()` que devuelve `3.1415` mediante una lambda.

- **Ejercicio 6:** Ordena una lista de Strings y números por longitud de menor a mayor.

- **Ejercicio 7:** Reordena la misma lista en orden inverso (de más larga a más corta).

- **Ejercicio 8:** Crea una interfaz funcional `Reverse` con un método `reverse(String)` que invierte cadenas mediante una lambda.

---

### 🔸 Nivel 2 – Lambdas más complejas y personalizadas

- **Ejercicio 1:** Filtra una lista de nombres que comienzan con `'A'` y tienen exactamente 3 letras.

- **Ejercicio 2:** Transforma una lista de números en un String donde cada número va precedido de `'e'` si es par o `'o'` si es impar.

- **Ejercicio 3:** Crea una interfaz funcional `Operacion` con un método que retorna `float`, e inyecta operaciones básicas: suma, resta, multiplicación, división.

- **Ejercicio 4:** Realiza múltiples operaciones sobre una lista mixta (números y texto):
    - Ordenar por el primer carácter.
    - Mostrar primero los Strings que contienen `'e'`.
    - Reemplazar todas las `'a'` por `'4'`.
    - Filtrar y mostrar únicamente elementos numéricos (aunque estén en formato String).

---

### 🔺 Nivel 3 – Lambdas avanzadas con objetos

- **Ejercicio 1:**

    - Crea una clase `Alumno` con atributos: nombre, edad, curso y nota.
    - Llena una lista con 10 alumnos.
    - Muestra por pantalla nombre y edad de cada uno.
    - Filtra alumnos cuyo nombre comienza con `'a'` y guarda en nueva lista.
    - Filtra alumnos con nota ≥ 5.
    - Filtra alumnos con nota ≥ 5 que **no** cursan PHP.
    - Muestra alumnos que cursan JAVA y son mayores de edad.

---

## 🛠️ Instalación

1. Clona el repositorio:  
   `git clone https://github.com/GabyB73/Sprint1Tasca8.git`
2. Abre el proyecto en IntelliJ o Eclipse.
3. Si utilizas Maven, asegúrate de que el archivo `pom.xml` está presente y actualizado.

---

## ▶️ Ejecución

- Cada clase contiene un método `main()` para ejecutar el ejercicio correspondiente.

- Puedes probar las funcionalidades de forma individual desde IntelliJ.
---

## 🤝 Contribuciones

Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy


---
