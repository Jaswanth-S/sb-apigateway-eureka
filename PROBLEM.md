## Problem Statement: Experiment with deploying Spring Boot microservice which uses API gateway on k8s cluster in AWS EKS

* In this Exercise, you will concentrate on building docker images for the given Spring Boot Applications using docker-compose: 

This exercise contains

    - ApiGatewayService which acts as API Gateway
    - SbServiceOne is a RESTful SpringBoot application
    
All these services are having Dockerfile, understand and do the following steps in docker-compose.yml:

    1. Create the services with the names config-service, eureka-service,apigateway-service,sbservice-one
    2. Use the depends_on field to ensure proper sequence of container start-ups
    3. Run `docker-compose up --build` to start all the containers 
    4. Check that eureka-service is up, apigateway-service and sbservice-one is registered, open `http://localhost:8761` url in browser
    5. Check accessing sbservice-one through apigateway-service, open `http://localhost:9000/sbservice-one/hello` url in browser
    6. Run `docker-compose down` to stop all the containers
      
  
  
### Instructions
 - Take care of whitespace/trailing whitespace
 - Do not change the provided class/method names unless instructed
 - Ensure your code compiles without any errors/warning/deprecations 
 - Follow best practices while coding