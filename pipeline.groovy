pipeline {
    agent any
    stages {
        stage('Echo Hello'){
            steps{
                echo "Hello World!"
            }
        }

        stage("run python"){
            steps{
                sh 'python3 hello.py'
            }
        }
    }
}