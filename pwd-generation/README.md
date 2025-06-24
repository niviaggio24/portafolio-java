# DecimalToBinary

Este es un proyecto en Java que genera contraseñas seguras basadas en combinaciones de caracteres definidos por argumentos. 
Fue diseñado como una herramienta de línea de comandos,
con soporte para pruebas unitarias usando JUnit 5.

## 🧠 ¿Qué hace?

Genera contraseñas de 16 caracteres con distintos tipos de símbolos dependiendo de los argumentos que le des.

Por ejemplo, puedes generar contraseñas que incluyan:

Letras minúsculas (-L)

Letras mayúsculas (-U)

Números (-N)

Símbolos especiales (-S)

##🗂️ Estructura del proyecto
 PasswordGenerator/
├── PasswordGenerator.java      # Clase principal
├── PasswordGeneratorTest.java  # Clase de prueba con JUnit
├── README.md                   # Este archivo


### ▶️ Cómo ejecutar el generador

 
javac PasswordGenerator.java
java PasswordGenerator -L -N
java PasswordGenerator -L -N	Letras minúsculas y números
java PasswordGenerator -L -U	Letras minúsculas y mayúsculas
java PasswordGenerator -L -U -S	Minúsculas, mayúsculas y símbolos
java PasswordGenerator -U Copy	Mayúsculas y copia al portapapeles (si es posible)

🧪 Cómo ejecutar las pruebas con JUnit
Opción 1: Manual con .jar de JUnit
Descarga el archivo junit-platform-console-standalone-1.9.3.jar.

Compila ambos archivos:

javac -cp .:junit-platform-console-standalone-1.9.3.jar PasswordGenerator.java PasswordGeneratorTest.java
Ejecuta los tests:
 
java -jar junit-platform-console-standalone-1.9.3.jar -cp . --select-class PasswordGeneratorTest