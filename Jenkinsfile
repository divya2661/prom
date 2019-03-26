pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh '''sudo apt-get -y install gradle
gradle build'''
      }
    }
  }
}