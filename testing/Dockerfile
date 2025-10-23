# =========================
# Stage 1: Build the JAR
# =========================
FROM maven:3.9.2-eclipse-temurin-17 AS build
WORKDIR /app

# Copy Maven project files
COPY pom.xml .
COPY src ./src

# Build the project (skip tests to speed up)
RUN mvn clean package -DskipTests

# =========================
# Stage 2: Run the JAR
# =========================
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built jar file from the first stage
COPY --from=build /app/target/testing-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
