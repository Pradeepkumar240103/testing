# Stage 1: Build
FROM maven:3.9.2-eclipse-temurin-17 AS build
WORKDIR /app
# Copy only what Maven needs
COPY pom.xml .
COPY src ./src
# Build the project
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM openjdk:17
WORKDIR /app
# Copy the built JAR from Stage 1
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

