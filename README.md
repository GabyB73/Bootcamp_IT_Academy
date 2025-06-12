# 📬 Sprint 4  Tasca 1 Nivel 3: Pruebas con Postman

---

## 📝 Descripción

Este proyecto consiste en realizar pruebas sobre las APIs desarrolladas en los niveles anteriores (Maven y Gradle) utilizando **Postman**.

🔗 Proyectos previos utilizados:

- [Sprint4Tasca1Nivel1 (Maven)](https://github.com/GabyB73/Sprint4Tasca1Nivel1)
- [Sprint4Tasca1Nivel2 (Gradle)](https://github.com/GabyB73/Sprint4Tasca1Nivel2)

---

## 🎯 Objetivos

- Probar endpoints REST con Postman.
- Crear y configurar entornos personalizados.
- Usar variables en las URLs de las peticiones.
- Exportar entornos y documentar pruebas.

---

## 🧪 Entornos Postman creados

Se han creado **dos entornos**:

1. **S4T1Nivel3 Proyecto Maven**
   - `servidor`: `http://localhost`
   - `port`: `9000`

2. **S4T1Nivel3 Proyecto Gradle**
   - `servidor`: `http://localhost`
   - `port`: `9001`

---

## 📁 Archivos entregados

En este repositorio encontrarás los siguientes archivos:

- 📄 [`S4T1Nivel3 Proyecto Maven.postman_environment.json`](./S4T1Nivel3%20Proyecto%20Maven.postman_environment.json)
- 📄 [`S4T1Nivel3 Proyecto Gradle.postman_environment.json`](./S4T1Nivel3%20Proyecto%20Gradle.postman_environment.json)
- 📸 ![Captura Maven](https://github.com/GabyB73/Sprint4Tasca1Nivel3/raw/master/Captura%20de%20pantalla%20Entorno%20Maven.png)
- 📸 ![Captura Gradle](https://github.com/GabyB73/Sprint4Tasca1Nivel3/raw/master/Captura%20de%20pantalla%20Entorno%20Gradle.png)

📸 Las capturas muestran los resultados de las pruebas realizadas con éxito.

---

## 📥 Cómo importar los entornos en Postman

1. Abre Postman.
2. Ve a la pestaña de **Environments**.
3. Haz clic en **Import**.
4. Selecciona uno de los archivos `.json`.
5. Activa el entorno desde la parte superior derecha.

---

## 🔁 Peticiones probadas

Se realizaron pruebas a los siguientes endpoints usando variables de entorno:

```
{{Servidor}}:{{puerto}}/HelloWorld
{{Servidor}}:{{puerto}}/HelloWorld?nombre=Gaby
{{Servidor}}:{{puerto}}/HelloWorld2
{{Servidor}}:{{puerto}}/HelloWorld2/Gaby
```

---

## 🔗 Recursos utilizados

1- [https://www.youtube.com/watch?v=9I9U5-WUrDo](https://www.youtube.com/watch?v=9I9U5-WUrDo)

2- [https://learning.postman.com/docs/getting-started/sending-the-first-request/](https://learning.postman.com/docs/getting-started/sending-the-first-request/)

---

## 🤝 Contribuciones  
  
Este es un proyecto de práctica del bootcamp IT Academy.    
Las contribuciones no son necesarias, pero puedes hacer un fork o dejar comentarios si lo deseas.  
  
---

## 👩‍💻 Autora

Desarrollado por **[Gabriela Bustamante](https://github.com/GabyB73)**  
Bootcamp de Desarrollo Java - IT Academy  
