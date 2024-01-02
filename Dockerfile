FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/QueueService_BatterySim-0.0.1-SNAPSHOT.jar /app
EXPOSE 8081
CMD ["java", "-jar", "QueueService_BatterySim-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]