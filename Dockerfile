# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy your compiled .jar file into the container (replace with your actual .jar name)
COPY target/demo1-0.0.1-SNAPSHOT.jar demo1.jar

# Expose the port your application runs on (if needed)
EXPOSE 8080

# Run the Java application
CMD ["java", "-jar", "demo1.jar"]
