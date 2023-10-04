pipeline {
    agent any 
    tools {
        maven "3.8.5"
    
    }
    stages {
	stage('Git Checkout'){
            steps{
                git url:'https://github.com/Semir-Devops/docker-jenkins', branch: 'main'
            }
        }
        stage('Maven build'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('Build Docker image'){
          
            steps {
                echo "Hello Semirdevops"
                sh 'ls'
                sh 'docker build -t semirdevops/docker_jenkins_springboot:${BUILD_NUMBER} .'
            }
        }
        stage('Docker Login'){
            
            steps {
                 withCredentials([string(credentialsId: 'DockerId', variable: 'Dockerpwd')]) {
                    sh "docker login -u semirdevops -p ${Dockerpwd}"
                }
            }                
        }
        stage('Docker Push'){
            steps {
                sh 'docker push semirdevops/docker_jenkins_springboot:${BUILD_NUMBER}'
            }
        }
        stage('Docker deploy'){
            steps {
               
                sh 'docker run -itd -p 8081:8080 semirdevops/docker_jenkins_springboot:${BUILD_NUMBER}'
            }
        }
    }
}

