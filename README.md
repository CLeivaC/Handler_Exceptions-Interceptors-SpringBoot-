# Handler_Exceptions-Interceptors

Proyecto de Spring Boot que implementa interceptores personalizados y manejo de excepciones, junto con un sistema de gestión de productos a través de dos endpoints: `getAllProducts` y `getProductById`.

## Características

- **Endpoints de productos**:
  - `GET /products`: Devuelve una lista de todos los productos disponibles.
  - `GET /products/{id}`: Devuelve un producto específico basado en su ID.
- **Interceptores personalizados**: Dos interceptores (`LoggerInterceptor` y `TimeInterceptor`) configurados para interactuar con las solicitudes HTTP.
  - `LoggerInterceptor`: Registra la duración de las solicitudes HTTP y los métodos controladores que se ejecutan.
  - `TimeInterceptor`: Verifica si una solicitud ocurre dentro del horario laboral configurado y devuelve un mensaje personalizado si la solicitud es fuera de horario.
- **Manejo de excepciones**: Utilización de Spring Boot para manejar errores y generar respuestas HTTP personalizadas.
- **Inyección de dependencias**: Uso de `@Autowired` y `@Qualifier` para inyectar diferentes interceptores en la configuración de la aplicación.
- **Configuración externa**: Uso de `application.properties` para definir los horarios de atención (propiedades `open` y `close`).

## Requisitos

- **Java 17+**: Este proyecto utiliza características compatibles con Java 17 o superior.
- **Maven**: Utiliza Maven para la gestión de dependencias y la construcción del proyecto.
- **Spring Boot 3+**: El proyecto está construido sobre Spring Boot 3 o una versión posterior.

