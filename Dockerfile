FROM openjdk:8
EXPOSE 8080
ADD target/docker-demo-image.jar docker-demo-image.jar
ENTRYPOINT ["java","-jar","docker-demo-image.jar"]