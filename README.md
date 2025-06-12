# 🚨 Sprint 1 - Tasca 6 : Genéricos - Nivel 1/2/3

---

## 📄 Descripción

Esta tarea tiene como objetivo comprender y aplicar el uso de **Genéricos en Java**, un mecanismo clave para mejorar la reutilización de código y la seguridad en tiempo de compilación.

Todos los ejercicios han sido desarrollados utilizando IntelliJ IDEA en un proyecto Java gestionado con Maven.

---
## 🎯 Objetivos

- Comprender el concepto de tipos genéricos y su utilidad.
- Implementar métodos y clases genéricas.
- Aplicar restricciones en los tipos genéricos.
- Utilizar listas de argumentos con tipo genérico indefinido.
- Explorar el uso de interfaces como límite en tipos genéricos.

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
src/
│
├── main/
│   └── java/
│       ├── N1Ejercicio1/           → Clase sin genéricos que almacena tres objetos del mismo tipo (NoGenericMethods)
│       ├── N1Ejercicio2/           → Uso básico de métodos genéricos con distintos tipos y clase Persona
│       ├── N2Ejercicio1/           → Método genérico con un argumento no genérico
│       ├── N2Ejercicio2/           → Método genérico con lista de argumentos variable (varargs)
│       └── N3Ejercicio1/           → Interfaces y clases genéricas con restricciones (Teléfono, Smartphone, Genérica)
│
```

---

## 🧪 Niveles y Funcionalidades

### 🔹 Nivel 1

#### 1. `NoGenericMethods.java`

- Clase que almacena tres objetos del mismo tipo (sin utilizar genéricos).
- Constructor permite pasar los argumentos en cualquier orden.
- Métodos para almacenar y extraer los objetos.
#### 2. `GenericMethods.java` con clase `Persona`

- Clase `Persona` con atributos: nombre, apellido y edad.
- Método genérico que acepta tres parámetros de cualquier tipo y los imprime.
- Comprobación de uso con distintos tipos: objeto `Persona`, `String`, y un tipo primitivo.

---

### 🔸 Nivel 2

#### 1. Método con mezcla de tipos

- Se modifica el método genérico anterior para que uno de los parámetros no sea genérico (por ejemplo, un `String` fijo).
#### 2. Lista de argumentos indefinida

- Versión del método anterior que acepta una cantidad variable de argumentos genéricos (varargs).

---

### 🔺 Nivel 3

#### 1. Genéricos con restricciones de interfaz y clase

- Se crea una interfaz `Telefono` con el método `llamar()`.
- Clase `Smartphone` implementa `Telefono` y añade el método `hacerFotos()`.
- Clase `Generica` con dos métodos genéricos:
    - Uno restringido a tipos que implementen `Telefono`.
    - Otro restringido a la clase `Smartphone`.
- Desde estos métodos se invocan los métodos permitidos según la restricción de tipo.
- En `Main`, se prueba la llamada a ambos métodos pasando un objeto `Smartphone`.

---

## 🛠️ Instalación

1. Clona el repositorio:  
   `git clone https://github.com/GabyB73/Sprint1Tasca6.git`
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
