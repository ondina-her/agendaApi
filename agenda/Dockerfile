# Etapa de construcción
FROM eclipse-temurin:21-jdk-alpine AS build

WORKDIR /workspace

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src ./src

# 👇 Dar permisos de ejecución a mvnw
RUN chmod +x mvnw

# 👇 Compilar el proyecto
RUN ./mvnw clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /workspace/target/agenda-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
