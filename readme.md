# My Pipeline build with docker Integration


This repository will explain my Jenkins pipeline build that involves building a docker image,<br/>running this image in a docker container mounted on an AWS EC2<br/>then pushing it to my public docker repository on Docker hub and deploying it 

<br/>
This docker container will output a Hello message on port 8081 of my EC2 Instance<br/> but the container will display that content on port 8080 on the backend.<br/>
<br/>
The output is created using java as a springboot application integrated with Maven as an automated build tool configured on Jenkins.
<hr/>

Firstly, I must explain the 'Jenkinsfile' & each of the build stages:<br/>

<ins><b>Tool Install</b></ins>: This will grab the Maven build tool that exists on the docker host

<ins><b>Git Checkout</b></ins>: This will perform a git Checkout command on this repository<br/> to update the docker container & its output.

<ins><b>Maven Build</b></ins>: This step will clean & compile the Maven build tool on the code & look for changes.

<ins><b>Maven Build install</b></ins>: If there are changes to the code,<br/> Maven will re-install the new code to its local repository on the machine. 

<ins><b>Build Docker Image</b></ins>: This build stage will build the speicifed Docker image with the specified Tag<br/>which is the Jenkins build number in this case.

<ins><b>Docker Login & push</b></ins>: This will take the image & push it to the specified Docker hub account,<br/> then it it will push the image to the docker hub.

<ins><b>Docker Deploy</b></ins>: This command will deploy the specified docker image as a container,<br/>
 with the name of the image, the port numbers on the dockerhost and the container.

<hr/>

Secondly, the Dockerfile must be explained:

<img width="848" alt="Jenkins-pipeline" src="https://github.com/Semir-Devops/docker-jenkins/assets/144611511/af783694-de71-4f67-8af3-eb81a4a8e618">
<img width="803" alt="Docker-hub" src="https://github.com/Semir-Devops/docker-jenkins/assets/144611511/e1364a6b-e317-46f6-a53a-2ceb5c06e505">
<img width="941" alt="Docker-output" src="https://github.com/Semir-Devops/docker-jenkins/assets/144611511/dea6f8f7-aa78-4835-9b25-c8effb2f3101">
