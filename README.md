# Gestor de Incidencias de Soporte — Centro Educativo

Aplicación de consola desarrollada en Java para consultar y gestionar de manera rápida y eficiente las incidencias de soporte técnico registradas en el centro.

---

## Características y Funcionalidades
La aplicación permite realizar las siguientes operaciones tanto mediante un menú interactivo en bucle como por argumentos en la línea de comandos:
* **Listar todas las incidencias**: Muestra el registro completo de avisos
* **Listar incidencias abiertas**: Filtra y muestra únicamente aquellas incidencias que siguen activas
* **Búsqueda por texto**: Permite buscar incidencias filtrando por coincidencias en su identificador o título
* **Consulta por ID**: Muestra el detalle de una incidencia específica introduciendo su identificador exacto

---

## Versión de Java
* **Java SDK**: Versión 17 o superior.

---

## Compilación y Ejecución
Puedes compilar y ejecutar el proyecto utilizando Maven desde la terminal de VS Code:

```bash
# Compilar el proyecto y ejecutar la aplicación interactiva
mvn clean compile exec:java
