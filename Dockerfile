FROM openjdk:8
ADD target/springboot-ms-docker-poc.jar springboot-ms-docker-poc.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-ms-docker-poc.jar"]
