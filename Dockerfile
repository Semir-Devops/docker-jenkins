FROM openjdk:8

EXPOSE 8080

ADD target/semirdevops-springboot-docker.jar semirdevops-springboot-docker.jar

ENTRYPOINT ["java","-jar","semirdevops-springboot-docker.jar"]
