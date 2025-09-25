### Notas del TP:
- En el punto 2c en nuestro caso, como trabajamos con Visual Studio Code, deberíamos agregar al .gitignore al directorio .vscode/ pero ya viene configurado por defecto.
- En el punto 2d nos olvidamos de la forma de versionado. Este release seria release/1.0.0.
---
# Documentar con Git

## ¿Qué se documenta en README?
En el documento README se escribe la información necesaria para que cualquier persona externa pueda entender, ejecutar y contribuir al proyecto. Se debe documentar:

- **Nombre y descripción del proyecto:** qué hace y cuál es su propósito.  
- **Requisitos e instalación:** dependencias y extensiones necesarias, pasos para configurar el entorno y ejecutar la aplicación.  
- **Uso de la aplicación:** cómo ejecutar el código, ejemplos de ejecución, endpoints y funcionalidades principales.  
- **Estructura del proyecto:** explicación de las carpetas y archivos más importantes.  
- **Flujo de desarrollo y método aplicado:** cómo se gestionan las ramas (`develop`, `feature`, `release`, `hotfix`) y formato de versionado utilizado.  
- **Autores y contacto:** quiénes desarrollaron el proyecto y como se pueden contactar con ellos.  
- **Licencia:** tipo de licencia del proyecto en caso de tener una.  
- **Registro de cambios (changelog):** historial de versiones, funcionalidades nuevas y correcciones. 

#### Fuentes:
- [1] GitHub, Inc., “Acerca del archivo LÉAME del repositorio,” GitHub Docs, 2025. [En línea]. Disponible en: https://docs.github.com/es/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes.
 [Accedido: 23- Sep- 2025].
- [2] H. Nyakundi, “How to Write a Good README File for Your GitHub Project”, freeCodeCamp, 8-dic-2021. [En línea]. Disponible: https://www.freecodecamp.org/news/how-to-write-a-good-readme-file/
. [Accedido: 23-sep-2025].


## Pull Requests 
Cuando un desarrollador externo realiza una modificación en el proyecto, es fundamental entender cual fue el cambio que realizó, por qué y cómo afecta al proyecto. Para esto se utilizan los Pull Requests (PR) en GitHub.

### ¿Que datos que se deberían solicitar al colaborador externo?
Al momento de crear un Pull Request, es recomendable que el desarrollador indique la siguiente información:
1. **Título del PR**: debe resumir de forma clara y detallada de la modificación propuesta.  
2. **Descripción del PR**: explicación detallada de los cambios realizados, incluyendo:  
   - Qué problema resuelve o qué funcionalidad agrega.  
   - Archivos y partes del código modificadas.  
   - Cómo probar los cambios y posibles efectos secundarios.  
3. **Referencias a issues o tareas**: si se está trabajando con un sistema de seguimiento de tareas (Jira, GitHub Issues, etc.), y el cambio está asociado a un issue o tarea, incluir el número para facilitar el seguimiento.  
4. **Capturas o ejemplos**: si el cambio afecta la interfaz gráfica, añadir capturas de pantalla, GIFs o videos.  
5. **Checklist de pruebas**: confirmar que el código fue testeado y no rompe funcionalidades existentes.  
6. **Notas / preguntas abiertas**: si hay decisiones dudas, riesgos conocidos, modificaciones que faltan por hacer se deben indicar para que los revisores sepan donde continuar o que información aportar.

### ¿Qué nos ofrece GitHub para ayudar en esto?
GitHub facilita la revisión de cambios externos mediante varias herramientas integradas:

- **Comparación de ramas**: permite ver exactamente qué líneas de código se agregaron, modificaron o eliminaron.  
- **Comentarios en línea**: se puede dejar feedback directamente sobre líneas específicas del código.  
- **Checks automáticos / CI**: integración con pipelines que verifican que el código compile, pase tests y cumpla estándares de calidad.  
- **Historial de commits**: cada commit dentro del PR queda registrado con autor, fecha y mensaje descriptivo.  
- **Etiquetas y asignación**: se puede asignar revisores, añadir labels y vincular a issues, facilitando la trazabilidad del cambio.  

#### Fuentes de información:
- [1] M. Kerem Keskin, “Good Manners of a Pull Request & Some Best Practices,” Delivery Hero Tech Hub, 17 Nov. 2021. [En línea]. Disponible: https://medium.com/deliveryherotechhub/good-manners-of-a-pull-request-some-best-practices-cb2de3c3aea1. [Accedido: 23-Sep-2025].

- [2] “Pull Request Best Practices,” Codacy Blog, 5 dic. 2023. [En línea]. Disponible: https://blog.codacy.com/pull-request-best-practices?utm_source=chatgpt.com. [Accedido: 23-Sep-2025].

- [3] Mercedes Bernard, “What to Include in a Pull Request Description,” CloudCity, 8 ago. 2022. [En línea]. Disponible: https://www.cloudcity.io/blog/2022/08/08/what-to-include-in-a-pull-request-description/?utm_source=chatgpt.com. [Accedido: 25-Sep-2025].

- [4] “What is a Pull Request?” PagerDuty Resources – Continuous Integration & Delivery, sin fecha clara de publicación. [En línea]. Disponible: https://www.pagerduty.com/resources/continuous-integration-delivery/learn/what-is-a-pull-request/#heading-2. [Accedido: 25-Sep-2025].
