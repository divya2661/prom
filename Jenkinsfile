pipeline {
  agent {
    docker {
      image 'java:8'
    }

  }
  stages {
    stage('Test') {
      steps {
        sh 'gradle build'
      }
    }
  }
}