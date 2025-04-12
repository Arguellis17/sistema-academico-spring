# 📚 Sistema Académico - Spring Boot

Este proyecto es un sistema académico desarrollado con Java y Spring Boot como parte de la evaluación del tercer corte de la asignatura **Programación Web**. 
El propósito de este sistema es simular la gestión académica de una institución educativa, permitiendo la administración de estudiantes, docentes, cursos, evaluaciones, comunicaciones y más. Está diseñado aplicando buenas prácticas de arquitectura por capas y principios de diseño limpio.
Este trabajo ha sido realizado bajo la guía del profesor **Jonathan Rolando**.

## 🚀 Características principales

- Gestión completa de estudiantes, docentes, cursos y calificaciones.
- API RESTful organizada por módulos funcionales.
- Arquitectura basada en servicios (`Service`, `Repository`, `Controller`, `Model`).
- Persistencia con Spring Data JPA.

---

🧩 Módulos Funcionales

### 1. Módulo de Gestión de Estudiantes (Responsable: **Sebas**)

- **Registro y Actualización**: Permitir el alta, modificación y eliminación de la información personal y académica de cada estudiante.
- **Matrícula e Inscripción**: Gestionar el proceso de matrícula, inscripción a cursos y asignaturas, considerando requisitos y prerrequisitos.
- **Gestión de Asistencia**: Registrar la asistencia a clases y generar reportes de inasistencias o ausencias justificadas.
- **Historial Académico**: Visualización del rendimiento académico, cursos aprobados y calificaciones.

### 2. Módulo de Gestión de Docentes (Responsable: **Chinchilla**)

- **Registro y Actualización**: Permitir el alta, modificación y eliminación de datos personales y profesionales de los docentes.
- **Asignación de Cursos**: Asignar cursos o asignaturas a cada docente, considerando disponibilidad y carga horaria.
- **Gestión de Evaluaciones**: Facilitar la creación, aplicación y registro de evaluaciones, exámenes y otros instrumentos de medición del rendimiento estudiantil.

### 3. Módulo de Gestión de Cursos y Asignaturas (Responsable: **Arguello**)

- **Creación y Administración**: Permitir el diseño, modificación y eliminación de cursos y asignaturas, definiendo contenidos, objetivos y competencias a desarrollar.
- **Programación de Horarios**: Establecer y gestionar los horarios de clases, exámenes y tutorías, evitando solapamientos y optimizando el uso de recursos.
- **Inscripción y Cancelación**: Permitir a los estudiantes inscribirse o cancelar la inscripción en cursos, con validación de cupos y cumplimiento de prerrequisitos.

### 4. Módulo de Evaluación y Calificaciones (Responsable: **Jonathan**)

- **Registro de Calificaciones**: Permitir el ingreso, modificación y consulta de calificaciones de evaluaciones, exámenes y trabajos.
- **Cálculo de Promedios y Estadísticas**: Automatizar el cálculo de promedios, proyecciones de rendimiento y generación de reportes de desempeño.
- **Retroalimentación**: Facilitar la comunicación de resultados y comentarios entre docentes y estudiantes.

---

## 🛠️ Tecnologías utilizadas

- Java 24+
- Spring Boot 3.x
- Spring Data JPA
- Spring Web
- Lombok
- H2 / MySQL
- Maven

---

## 📁 Estructura del proyecto

## 🧱 Estructura del Proyecto

Este proyecto está organizado siguiendo una **arquitectura por capas**, que separa responsabilidades para una mejor mantenibilidad, escalabilidad y claridad del código. A continuación se describe la estructura del proyecto:

```plaintext
src/
└── main/
    ├── java/
    │   └── sistemaAcademico/
    │       ├── controllers/      # Controladores REST: reciben las peticiones HTTP
    │       ├── model/            # Entidades del modelo de datos (JPA)
    │       ├── repository/       # Repositorios (interfaces que extienden JpaRepository)
    │       ├── service/          # Interfaces de servicios (definen la lógica de negocio)
    │       └── serviceImpl/      # Implementaciones de los servicios
    │
    ├── resources/                # Archivos de configuración (application.properties, etc.)

```
Los servicios están divididos en dos carpetas:

- __service/:__ contiene las interfaces de los servicios.

- __serviceImpl/:__ contiene las implementaciones de dichas interfaces.

Esta separación permite seguir el principio de inversión de dependencias y facilita el testing, el mantenimiento y el desacoplamiento del código.

## 📦Dependencias y POM.xml

Este proyecto usa Maven como sistema de construcción. A continuación, un resumen de las dependencias más importantes configuradas en el archivo pom.xml

🧰 Dependencias Principales

- Spring Boot Starter Web: para construir APIs REST.

- Spring Boot Starter Data JPA: para persistencia y uso de Hibernate con PostgreSQL.

- Spring Boot Starter Actuator: para monitoreo de la aplicación.

- Spring Boot Devtools: para recarga automática en desarrollo.

- Lombok: reduce la verbosidad del código mediante anotaciones.

- PostgreSQL Driver: conector a base de datos PostgreSQL.

## Contribuidores

| Nombre              | Correo                               | GitHub                                      |
|---------------------|--------------------------------------|---------------------------------------------|
| Juan Arguello       | juandavidaa@ufps.edu.co              | [Arguellis17](https://github.com/Arguellis17) |
| Jonathan Guevara    | jonathangc@ufps.edu.co               | [JonathanGuevaraC](https://github.com/JonathanGuevaraC) |
| Jesus Chinchilla    | jesusdavidcm@ufps.edu.co             | [JesusDavidChinchillaMachuca](https://github.com/JesusDavidChinchillaMachuca) |
| Sebastian Lopez     | johansebastianlo@ufps.edu.co         | [SebsMusicLive](https://github.com/SebsMusicLive) |

## 🚀 Clonar el proyecto

Puedes clonar este repositorio usando el siguiente comando:

```bash
git clone https://github.com/Arguellis17/sistema-academico-spring.git
```

## 📄 Licencia
Este proyecto está bajo la licencia MIT. 

