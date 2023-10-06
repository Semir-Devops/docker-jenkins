# My Pipeline build with docker Integration


This repository will explain my Jenkins pipeline build that involves building a docker image,<br/>running this image in a docker container mounted on an AWS EC2<br/>then pushing it to my public docker repository on DockerHub and deploying it 
<hr/>
This docker container will output a Hello message on port 8081 of my EC2 Instance<br/> but the container will display that content on port 8080 on the backend.<br/>
The output is created using java as a springboot application integrated with Maven as an automated build tool configured on Jenkins.
