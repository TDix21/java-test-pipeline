pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo "Cloning repository..."
                git branch: 'main', url: 'https://github.com/TDix21/java-test-pipeline'
            }
        }

        stage('Compile Java') {
            steps {
                echo "Compiling Java source files..."
                bat 'if not exist bin mkdir bin'
                bat 'javac src\\*.java -d bin'
            }
        }

        stage('Run Tests') {
            steps {
                echo "Running Calculator tests..."
                bat 'java -cp bin tests.CalculatorTest'
            }
        }
    }

    post {
        success {
            echo "Pipeline succeeded!"
        }
        failure {
            echo "Pipeline failed!"
        }
    }
}