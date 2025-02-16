# 🎮 Skin API  

## 📌 Descripción  
Este proyecto es una API REST que permite a los usuarios consultar, adquirir, modificar y eliminar skins para un videojuego.  

## 🎯 Objetivo  
Desarrollar una API que gestione skins de un videojuego, permitiendo su consulta, compra, modificación y eliminación.  

## 📋 Requisitos  

### 🏗 Modelo de datos  
Cada skin tiene los siguientes atributos:  
- `id`: Identificador único.  
- `name`: Nombre de la skin.  
- `type`: Tipo de skin.  
- `price`: Precio de la skin.  
- `color`: Color de la skin.  

### 📂 Funcionalidades  
#### Endpoints disponibles  
- **GET** `/skins/available` → Lista de skins disponibles para comprar.  
- **POST** `/skins/buy` → Permite a los usuarios adquirir una skin.  
- **GET** `/skins/myskins` → Lista de skins compradas por el usuario autenticado.  
- **PUT** `/skins/color?id={id}&color={nuevo_color}` → Permite cambiar el color de una skin.  
- **DELETE** `/skins/delete/{id}` → Permite eliminar una skin comprada.  
- **GET** `/skins/getskin/{id}` → Devuelve una skin específica.  

## 🛠 Requisitos Técnicos  
✔ Código limpio y estructurado.  
✔ Funciones con responsabilidad única.  
✔ Patrón estructural adecuado.  
✔ Gestión centralizada de excepciones.  
✔ Documentación con Swagger.  
✔ Test unitarios en el servicio.  

