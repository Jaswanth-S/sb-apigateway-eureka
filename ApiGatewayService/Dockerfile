#Dockerfile for ApiGatewayService
FROM openjdk:11
EXPOSE  9000
COPY ./target/ApiGatewayService-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]