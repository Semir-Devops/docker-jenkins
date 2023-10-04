FROM openjdk:11

ADD target/semirdevops-springboot-docker.jar semirdevops-springboot-docker.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","semirdevops-springboot-docker.jar"]
