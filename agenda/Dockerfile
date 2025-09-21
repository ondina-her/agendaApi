# Etapa de construcción
FROM maven:3.9.4-eclipse-temurin-21-alpine AS build

WORKDIR /workspace

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src ./src

RUN ./mvnw clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /workspace/target/agenda-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
