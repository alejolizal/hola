# Spring Boot H2 Example with Vue 3

Este proyecto contiene un backend en Spring Boot con base de datos en memoria H2 y un frontend sencillo construido con Vue 3.

## Backend

Para compilar y ejecutar el backend:

```bash
cd backend
mvn spring-boot:run
```

El servidor expone la API REST en `/api/persons`.

## Frontend

El directorio `frontend` contiene un archivo `index.html` que consume la API utilizando Vue 3 desde CDN. Basta con abrir ese archivo en un navegador mientras el backend está en ejecución.

## Pruebas

Se incluye una prueba mínima para validar que el contexto de Spring Boot carga correctamente:

```bash
cd backend
mvn test
```
