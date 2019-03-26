pipeline {
  agent {
    node {
      label 'test'
    }

  }
  stages {
    stage('Test') {
      steps {
        sh '''sudo apt-get -y install gradle
gradle build'''
      }
    }
  }
}