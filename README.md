# 🚨 Sprint 1 - Tasca4 : Testing - Nivel 1/2/3

---

## 📄 Descripción

Esta tarea tiene como objetivo aprender a trabajar con las bibliotecas de aserciones **JUnit**, **Hamcrest** y **AssertJ**, además de introducirse en el desarrollo dirigido por pruebas (**TDD**).

Los ejercicios están organizados en tres niveles que cubren pruebas unitarias básicas, creación de matchers personalizados y aserciones avanzadas con diferentes tipos de datos y colecciones.

---

## 🎯 Objetivos

- Familiarizarse con la escritura y ejecución de pruebas unitarias usando JUnit.

- Crear y usar matchers personalizados con Hamcrest.

- Realizar aserciones avanzadas con AssertJ.

- Entender y aplicar el desarrollo dirigido por pruebas (TDD).

- Validar excepciones, colecciones, referencias, valores primitivos y objetos Optional en tests.

---

## 💻 Tecnologías Utilizadas

- Java 16 (OpenJDK 16.0.2)
- IntelliJ IDEA
- Maven (para gestión de dependencias y ejecución de tests)
- JUnit 5
- Hamcrest
- AssertJ
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
Sprint1Tasca4/
│
├── N1Ejercicio1/         → Lista ordenada de meses con tests JUnit
├── N1Ejercicio2/         → Cálculo de letra DNI con tests parametrizados JUnit
├── N1Ejercicio3/         → Método que lanza ArrayIndexOutOfBounds con test JUnit
├── N2Ejercicio1/         → Matcher personalizado para longitud de String con Hamcrest
├── N3Ejercicio1/         → Aserciones de igualdad y desigualdad de enteros con AssertJ
├── N3Ejercicio2/         → Aserciones de comparación de referencias con AssertJ
├── N3Ejercicio3/         → Aserción de igualdad de arrays con AssertJ
├── N3Ejercicio4/         → Aserciones sobre ArrayList heterogéneo con AssertJ
├── N3Ejercicio5/         → Verificación de key en Map con AssertJ
├── N3Ejercicio6/         → Validación de excepción ArrayIndexOutOfBounds con AssertJ
└── N3Ejercicio7/         → Comprobación de Optional vacío con AssertJ
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1 - JUnit

1. **Lista ordenada de meses:**  
    Crear una clase que inserte los meses del año en una lista ordenada.  
    Test con JUnit para comprobar: la lista tiene 12 elementos, no es nula, y en la posición 8 está "agosto".
    
2. **Cálculo de letra DNI:**  
    Clase `CalculoDni` que calcula la letra del DNI a partir del número.  
    Test parametrizado en JUnit para validar 10 números de DNI predefinidos.
    
3. **Excepción ArrayIndexOutOfBounds:**  
    Crear método que lance esta excepción.  
    Test para verificar que se lanza correctamente.
    

---

### 🔸 Nivel 2 - Hamcrest

1. **Matcher personalizado para longitud de String:**  
    Implementar un `FeatureMatcher` personalizado para comprobar la longitud de un String.  
    Test que verifica si la cadena `"Mordor"` tiene longitud 8, ajustando la prueba si es necesario.
    

---

### 🔺 Nivel 3 - AssertJ

1. **Comparación de valores enteros:**  
    Aserciones para demostrar igualdad y desigualdad entre dos objetos `Integer`.
    
2. **Comparación de referencias:**  
    Aserciones para verificar si dos referencias apuntan al mismo objeto o son distintas.
    
3. **Comparación de arrays:**  
    Aserción para comprobar que dos arrays de enteros son idénticos.
    
4. **Aserciones sobre ArrayList heterogéneo:**  
    Crear un `ArrayList` con varios objetos de distintos tipos.  
    Verificar el orden de inserción, existencia en cualquier orden, y que un objeto está presente solo una vez.  
    Comprobar que un objeto no añadido no está en la lista.
    
5. **Aserción sobre Map:**  
    Crear un mapa y verificar que contiene una clave (`key`) determinada.
    
6. **Excepción ArrayIndexOutOfBounds con AssertJ:**  
    Provocar la excepción en una clase y crear la aserción que valide que se lanza cuando corresponde.
    
7. **Objeto Optional vacío:**  
    Crear un `Optional` vacío y verificar con aserción que efectivamente está vacío.
    
---

## 🛠️ Instalación

1. Clona el repositorio:
          
    `git clone https://github.com/tu-usuario/Sprint1Tasca4.git`
    
2. Abre el proyecto en IntelliJ o Eclipse.
    
3. Verificar que `pom.xml` contiene las dependencias de JUnit, Hamcrest y AssertJ.
    

---

## ▶️ Ejecución de Tests

- Ejecutar todos los tests con Maven:  
    `mvn test`
    
- O ejecutar pruebas individuales desde IntelliJ IDEA.

---

## 🤝 Contribuciones  
  
Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.  
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy  


---
