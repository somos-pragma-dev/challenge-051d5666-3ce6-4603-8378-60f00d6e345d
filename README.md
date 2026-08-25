# Desarrollo de una API REST para gestión de productos

La empresa 'Fintech Soluciones' necesita una API REST para gestionar productos en su plataforma de préstamos personales. La API debe permitir la creación, lectura, actualización y eliminación de productos, con validaciones en los campos 'nombre', 'precio' y'stock'. Los nombres de los productos no pueden ser duplicados y los precios no pueden ser negativos. La API debe persistir los datos en una base de datos H2 y estar documentada con Swagger.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot REST API |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del dominio y creación de la estructura básica

**Objetivo:** Definir el dominio de los productos y crear la estructura básica de la API REST.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los campos necesarios para un producto (nombre, precio, stock, categoría).
- Establecer las reglas de validación para cada campo.
- Crear la estructura básica de la API con los endpoints necesarios (POST, GET, PUT, DELETE).

**Entregable:** Estructura básica de la API REST con endpoints definidos y reglas de validación establecidas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar los nombres duplicados y los precios negativos.
- Piensa en la mejor forma de representar la categoría de un producto.

</details>

### Fase 2: Implementación de la persistencia en H2

**Objetivo:** Implementar la persistencia de los productos en una base de datos H2.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Configurar la conexión a la base de datos H2.
- Crear las tablas necesarias para almacenar los productos.
- Implementar la lógica para persistir los productos en la base de datos.

**Entregable:** API REST con persistencia de productos en una base de datos H2.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar las transacciones y la consistencia de los datos.
- Piensa en la mejor forma de mapear los campos de los productos a las columnas de la tabla.

</details>

### Fase 3: Documentación con Swagger

**Objetivo:** Documentar la API REST con Swagger.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Configurar Swagger en la API REST.
- Crear la documentación para cada endpoint, incluyendo los campos de entrada y salida, y las reglas de validación.
- Probar la documentación con Swagger UI.

**Entregable:** API REST documentada con Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo hacer que la documentación sea clara y fácil de entender para los usuarios.
- Piensa en la mejor forma de representar las reglas de validación en la documentación.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un producto en el contexto de esta API REST?
- **paraQueSirve**: ¿Para qué sirve cada endpoint en la API REST?
- **comoSeUsa**: ¿Cómo se usa la base de datos H2 para persistir los productos?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al crear, leer, actualizar o eliminar productos?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de la documentación con Swagger?

## Criterios de Evaluacion

- Definición clara del dominio de los productos.
- Implementación correcta de la persistencia en H2.
- Documentación clara y completa con Swagger.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
