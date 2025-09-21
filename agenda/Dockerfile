From Maven:3.9.4-eclipse-temurin-21-alpine AS build
WORKDIR /wokspace
COPY pom.xml .
COPY src ./src
COPY mvnw mvnw
COPY src ./src


# Compila el proyecto y genera el JAR
RUN ./mvnw clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copia el JAR generado desde la etapa de build
COPY --from=build /workspace/target/agenda-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto que usa Spring Boot
EXPOSE 8080

# Comando para ejecutar la app
CMD ["java", "-jar", "app.jar"]


