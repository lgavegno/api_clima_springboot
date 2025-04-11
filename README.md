# 🌤️ API Clima - Spring Boot

Aplicación backend desarrollada en **Spring Boot** que consume datos de la API de OpenWeatherMap y los guarda en una base de datos MySQL.  
Este backend forma parte del proyecto **API Clima Simple**, que también incluye un frontend en React y un segundo backend en Node.js.

---

## 🚀 Tecnologías

- **Java 17**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **OpenWeatherMap API**

---

## ⚙️ Funcionalidades

- 📡 Consulta del clima actual por ciudad usando OpenWeatherMap
- 🗄️ Persistencia de datos meteorológicos en MySQL
- 🔄 Endpoints REST para obtener y guardar información climática
- 🔐 Separación de configuraciones sensibles mediante `.env` o `application.properties` (excluido por `.gitignore`)

---

## 📂 Estructura del proyecto

```
api-clima-spring/
├── src/
│   ├── main/
│   │   ├── java/com/tu/paquete/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── model/
│   │   │   └── ApiClimaSpringApplication.java
│   │   └── resources/
│   │       ├── application.properties (IGNORADO)
│   │       └── ...
└── pom.xml
```

---

## 🔧 Configuración

1. Crear base de datos `clima_db` en MySQL.
2. Configurar `application.properties` (recuerda que está ignorado por `.gitignore`):

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/clima_db
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA

openweathermap.api.key=TU_API_KEY
```

3. Ejecutar el proyecto desde IntelliJ o usando:

```bash
./mvnw spring-boot:run
```

---

## 🧪 Ejemplo de endpoint

```
GET /clima/ciudad?nombre=Buenos Aires
```

---

## 📌 Notas

- Esta API se puede consumir desde el frontend React o desde otro backend (como el backend Node.js en este mismo proyecto).
- Requiere clave de API de OpenWeatherMap, que debe mantenerse oculta y fuera del repo.

---

## 📁 Licencia

MIT License

---
