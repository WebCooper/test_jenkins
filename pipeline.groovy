pipleline {
    agent any
    stages {
        stage('Echo Hello'){
            steps{
                echo "Hello World!"
            }
        }
    }
}