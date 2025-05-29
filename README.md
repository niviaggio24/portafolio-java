# ☕ Portafolio de Proyectos en Java

Este portafolio contiene una recopilación de proyectos desarrollados en Java. Incluye aplicaciones de consola, programas con interfaz gráfica y servicios backend usando frameworks como Spring Boot.

---

## 📁 Estructura de los proyectos

Este proyecto en Java permite convertir números arábigos (ej. 1, 2023, 3999) a números romanos (I, MMXXIII, MMMCMXCIX), y viceversa: de romanos a arábigos.
Incluye:

Una clase ArabicToRoman que convierte números arábigos a romanos.
Una clase RomanToArabic que convierte números romanos a arábigos.
Pruebas unitarias con JUnit para validar la conversión.
Método main() para ejecutar conversiones desde consola.

## ✅ Requisitos:
Java 17 o superior (funciona también con Java 21)
Maven 3.6+ instalado
Visual Studio Code (opcional, pero recomendado)

## ▶️ Ejecución desde la terminal (con Maven)
Clona el repositorio o navega al proyecto:
## Compila el proyecto con el siguiente comando:
mvn clean compile
## para ejecutarlo es 
mvn exec:java -Dexec.mainClass="com.proyecto.arabicnumerals.ArabicToRoman"
mvn exec:java -Dexec.mainClass="com.proyecto.arabicnumerals.RomanToArabic"
## 🧪 Ejecutar pruebas unitarias
mvn test
 

