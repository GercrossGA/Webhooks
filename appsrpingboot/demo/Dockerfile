# 1. Usar una imagen base de Java (JDK 17 es común para Spring Boot actual)
FROM eclipse-temurin:17-jdk-alpine

# 2. Crear un directorio de trabajo dentro del contenedor
WORKDIR /app

# 3. Copiar el archivo .jar generado por Gradle a la imagen
# Nota: Gradle guarda el jar en build/libs/
COPY build/libs/*.jar app.jar

# 4. Exponer el puerto en el que corre Spring Boot (por defecto 8080)
EXPOSE 8080

# 5. Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
