#Dockerfile for EurekaService
FROM openjdk:11
EXPOSE  8761
COPY ./target/EurekaService-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]