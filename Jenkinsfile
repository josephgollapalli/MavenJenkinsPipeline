pipeline {

    agent any 
    
    stages {
        stage('Compile Stage') { 
            steps {
                withMaven(maven : 'Maven3'){
                	sh 'mvn clean compile'
                }
            }
        }
        stage('Testing stage') { 
            steps {
                withMaven(maven : 'Maven3'){
                	sh 'mvn test'
                } 
            }
        }
        stage('Deploy stage') { 
            steps {
                withMaven(maven : 'Maven3'){
                	sh 'mvn deploy'
                } 
            }
        }
    }
}