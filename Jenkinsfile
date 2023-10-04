pipeline{
    agent any
    tools{
        maven 'apacheMaven'
    }
    stages{
        stage('Git Checkout'){
            steps{
                git url:'https://github.com/Semir-Devops/docker-jenkins', branch: 'main'
            }
        }
        stage('Maven build'){
            steps{
                sh 'mvn clean compile'
            }
        }
        stage('Maven build install'){
            steps{
                sh 'mvn install'
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
                 withCredentials([string(credentialsId: 'dockerHubpwd', variable: 'Dockerhubpwd')]) {
                     sh 'docker login -u semirdevops -p ${Dockerhubpwd}'
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
                sh 'docker run -dit -p 8082:8080 semirdevops/docker_jenkins_springboot:${BUILD_NUMBER}'
            }
        }
    }
}
