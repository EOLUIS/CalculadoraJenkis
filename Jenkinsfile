pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'  
        jdk 'JDK 11'  
    }

    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Compilando...'
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo 'Testando...'
                    sh 'mvn test'
                }
            }
        }
    }
}
