# Set the base image to a minimal Alpine Linux version with OpenJDK 17 installed
FROM openjdk:17-jdk-alpine3.14 AS builder

# Set the working directory to /app
WORKDIR /app

# Copy the application JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar ./my-application.jar

# Expose port 8080 for the application
EXPOSE 8080

# Set the entrypoint to launch the application
ENTRYPOINT ["java", "-jar", "my-application.jar"]
