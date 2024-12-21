# Use a base image that has OpenJDK
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your local machine to the container
COPY target/spring-boot-practice-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app will run on
EXPOSE 8080

# Command to run the application inside the container
ENTRYPOINT ["java", "-jar", "app.jar"]
