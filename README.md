# Sistema de Gestión — Usuarios y Censos

Aplicación web desarrollada con **Spring Boot 3** y arquitectura **MVC** que permite
gestionar usuarios del sistema y registros de censo poblacional mediante operaciones
CRUD completas.

---

##  ¿Qué hace esta aplicación?

- **Módulo de Usuarios:** crear, listar, editar y eliminar usuarios del sistema con nombre, clave y rol.
- **Módulo de Censos:** registrar levantamientos censales con datos de población, vivienda
  y servicios públicos por ubicación geográfica.

---

## Tecnologías utilizadas

| Tecnología | Versión | Uso |
|---|---|---|
| Java | 17 | Lenguaje principal |
| Spring Boot | 3.4.5 | Framework base |
| Spring MVC | - | Capa de controladores y vistas |
| Spring Data JPA | - | Persistencia y acceso a datos |
| Hibernate | - | ORM (mapeo objeto-relacional) |
| Thymeleaf | - | Motor de plantillas HTML |
| MySQL | 8.x | Base de datos relacional |
| Lombok | - | Reducción de código boilerplate |
| Bootstrap | 5.3 | Estilos CSS en las vistas |
| Maven | 3.9.x | Gestión de dependencias |

---

##  Estructura del proyecto
 ```text
src/main/
├── java/com/jarry/proyecto/
│   ├── controlador/
│   │   ├── UsuarioController.java
│   │   └── CensoController.java
│   ├── modelo/
│   │   ├── Usuario.java
│   │   └── Censo.java
│   ├── repositorio/
│   │   ├── UsuarioRepository.java
│   │   └── CensoRepository.java
│   ├── servicio/
│   │   ├── UsuarioService.java
│   │   ├── UsuarioServiceImpl.java
│   │   ├── CensoService.java
│   │   └── CensoServiceImpl.java
│   └── ProyectoApplication.java
└── resources/
    ├── templates/
    │   ├── index.html
    │   ├── usuarios/
    │   │   ├── listar.html
    │   │   └── formulario.html
    │   └── censos/
    │       ├── listar.html
    │       └── formulario.html
    └── application.properties
```     

---

## ⚙️ Requisitos previos

Antes de clonar y ejecutar el proyecto asegúrate de tener instalado:

- [Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) o superior
- [MySQL 8.x](https://dev.mysql.com/downloads/mysql/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recomendado) o cualquier IDE compatible con Maven
- Maven (incluido con el wrapper `mvnw` del proyecto)

---

## 🚀 Cómo ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/TU_USUARIO/TU_REPOSITORIO.git
cd TU_REPOSITORIO
```

### 2. Crear la base de datos en MySQL

Abre MySQL Workbench o tu cliente preferido y ejecuta:

```sql
CREATE DATABASE db_censo;
```

### 3. Crear el archivo `application.properties`

Este archivo **no está incluido en el repositorio** por seguridad.
Debes crearlo manualmente en la siguiente ruta:
src/main/resources/application.properties

Con el siguiente contenido (ajusta usuario y contraseña según tu instalación):

```properties
# Puerto del servidor
server.port=8080

# Conexión a MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/db_censo?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=TU_CONTRASEÑA

# Hibernate / JPA
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.properties.hibernate.format_sql=true
```

> ⚠️ `ddl-auto=update` hace que Hibernate cree y actualice las tablas automáticamente.
> No necesitas ejecutar ningún script SQL adicional.

### 4. Ejecutar la aplicación

**Desde IntelliJ:**
- Abre `ProyectoApplication.java`
- Clic derecho → **Run 'ProyectoApplication'**

**Desde la terminal:**
```bash
./mvnw spring-boot:run
```

En Windows:
```bash
mvnw.cmd spring-boot:run
```

### 5. Abrir en el navegador
http://localhost:8080

---

## 🗄️ Tablas generadas automáticamente

Hibernate crea estas tablas en `db_censo` al arrancar la aplicación por primera vez:

**`usuarios`**
| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT (PK) | Identificador único |
| nombre | VARCHAR | Nombre del usuario |
| clave | VARCHAR | Contraseña |
| rol | VARCHAR | Rol en el sistema |

**`censos`**
| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT (PK) | Identificador único |
| nombre | VARCHAR | Nombre del censo |
| fecha | DATE | Fecha del levantamiento |
| pais | VARCHAR | País |
| departamento | VARCHAR | Departamento |
| ciudad | VARCHAR | Ciudad |
| casa | VARCHAR | Dirección / casa |
| num_hombres | INT | Cantidad de hombres |
| num_mujeres | INT | Cantidad de mujeres |
| num_ancianos_hombres | INT | Ancianos hombres |
| num_ancianas_mujeres | INT | Ancianas mujeres |
| num_ninos | INT | Niños |
| num_ninas | INT | Niñas |
| num_habitaciones | INT | Habitaciones de la vivienda |
| num_camas | INT | Camas disponibles |
| tiene_agua | BOOLEAN | Servicio de agua |
| tiene_luz | BOOLEAN | Servicio de luz |
| tiene_alcantarillado | BOOLEAN | Alcantarillado |
| tiene_gas | BOOLEAN | Servicio de gas |
| tiene_otros_servicios | BOOLEAN | Otros servicios |
| nombre_sensador | VARCHAR | Nombre del encuestador |

---

## 🔗 Rutas disponibles

| Ruta | Método | Descripción |
|---|---|---|
| `/` | GET | Página de inicio |
| `/usuarios` | GET | Listar usuarios |
| `/usuarios/nuevo` | GET | Formulario nuevo usuario |
| `/usuarios/guardar` | POST | Guardar usuario |
| `/usuarios/editar/{id}` | GET | Formulario editar usuario |
| `/usuarios/eliminar/{id}` | GET | Eliminar usuario |
| `/censos` | GET | Listar censos |
| `/censos/nuevo` | GET | Formulario nuevo censo |
| `/censos/guardar` | POST | Guardar censo |
| `/censos/editar/{id}` | GET | Formulario editar censo |
| `/censos/eliminar/{id}` | GET | Eliminar censo |

---

## 👤 Autor

**Jose Rivera** — Proyecto académico desarrollado como práctica de Spring Boot MVC con JPA.
