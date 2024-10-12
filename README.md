# 🛠️ Handler_Exceptions-Interceptors

Este es un proyecto de **Spring Boot** que implementa **interceptores personalizados** y manejo de **excepciones**, además de un sistema de gestión de productos con tres endpoints clave: `getAllProducts`,`getProductById` y `postProduct` .

## 🚀 Características Principales

### 📝 Endpoints de Productos:
- **`GET /products`**: Obtén una lista de todos los productos disponibles.
- **`GET /products/{id}`**: Obtén los detalles de un producto específico basado en su ID.
- **`POST /products`**: Agrega un producto.

### 🔄 Interceptores Personalizados:
- **`LoggerInterceptor`**: Registra la duración de las solicitudes HTTP y los métodos controladores que se ejecutan.
- **`TimeInterceptor`**: Verifica si un usuario realiza un post dentro del horario laboral y devuelve un mensaje personalizado si está fuera de horario.

### ⚙️ Manejo de Excepciones:
- Implementación de un sistema de manejo de errores para generar respuestas HTTP personalizadas en caso de excepciones.

### 💉 Inyección de Dependencias:
- Uso de **`@Autowired`** y **`@Qualifier`** para gestionar la inyección de múltiples interceptores en la configuración de la aplicación.

### 🛠️ Configuración Externa:
- Configuración de horarios de operación mediante el archivo `application.properties` con las propiedades `open` y `close`.

## 🛠️ Requisitos

- **Java 17+**: El proyecto está basado en características compatibles con **Java 17** o superior.
- **Maven**: Para la gestión de dependencias y construcción del proyecto.
- **Spring Boot 3+**: El proyecto está construido sobre **Spring Boot 3** o una versión posterior.

## 📂 Estructura del Proyecto

```plaintext
src/
└── main/
    └── java/
        └── com/
            └── christian/
                └── ejercicio/
                    └── springboot/
                        ├── interceptores/
                        │   ├── interceptors/
                        │   │   ├── LoggerInterceptor.java
                        │   │   └── TimeInterceptor.java
                        │   ├── MvcConfig.java
                        │   └── Application.java
                        ├── repositories/
                        │   ├── ProductRepository.java
                        │   └── ProductRepositoryImpl.java
                        ├── services/
                        │   ├── ProductsService.java
                        │   └── ProductsServiceImpl.java
                        ├── controllers/
                        │   ├── ProductsController.java
                        │   └── HandlerExceptions.java
                        ├── models/
                        │   ├── Error.java
                        │   └── domain/
                        │       └── Product.java
                        └── Exceptions/
                            └── ProductNotFoundException.java


### Archivos Clave:
- **`LoggerInterceptor.java`**: Mide el tiempo de cada solicitud HTTP y registra el nombre del método controlador.
- **`TimeInterceptor.java`**: Valida si las solicitudes ocurren dentro del horario de atención y genera una respuesta en JSON en caso contrario.
- **`ProductController.java`**: Controlador que gestiona los endpoints de productos.
- **`ProductsService.java`**: Interfaz que define los servicios relacionados con los productos.
- **`ProductsServiceImpl.java`**: Implementación de la interfaz de servicios de productos.
- **`ProductRepository.java`**: Interfaz para la interacción con la base de datos de productos.
- **`ProductRepositoryImpl.java`**: Implementación de la interfaz del repositorio de productos.
- **`Product.java`**: POJO que representa un producto en el sistema.
- **`Error.java`**: POJO que representa un mensaje de error.
- **`ProductNotFoundException.java`**: Clase de excepción personalizada para manejar productos no encontrados.
- **`HandlerExceptions.java`**: Controlador para manejar excepciones en la aplicación.
