# Use an official OpenJDK runtime as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/BankSummaryServiceApplication-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot app runs on
EXPOSE 8081

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
