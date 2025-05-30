# Proyecto-ApiRest
Este proyecto es una API RESTful para la gestión de usuarios, proyectos y tareas construida con Java y Spring Boot. Permite realizar operaciones CRUD y consultar tareas filtradas por estado, prioridad o fecha.

# Tecnologías y herramientas utilizadas
| Herramienta                     | Descripción breve                                        |
| ------------------------------- | -------------------------------------------------------- |
| **Java 17**                     | Lenguaje base del proyecto.                              |
| **Spring Boot 3.5**             | Framework principal para la API REST.                    |
| **Spring Data JPA**             | ORM para conexión y operaciones con base de datos MySQL. |
| **MySQL**                       | Sistema de base de datos relacional.                     |
| **Postman**                     | Herramienta para probar los endpoints.                   |
| **Springdoc OpenAPI (Swagger)** | Genera documentación interactiva de la API.              |

# Guía de instalación y ejecución
1. Clonar el repositorio
2. Crear la base de datos en Mysql
   `` CREATE DATABASE proyectoapi;``
3. Actualizar credenciales en src/main/resources/application.properties
  `` spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña``
4. Ejecutar la aplicación
5. Probar la API
Navegar a http://localhost:8080/swagger-ui.html para usar Swagger UI.

Diagrama de la base de datos.

![image](https://github.com/user-attachments/assets/0a4b43cb-64f0-4d6b-82d7-3e4ccb93067d)

