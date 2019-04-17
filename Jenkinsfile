pipeline {
  agent any
  stages {
    stage('PrintMessage::start') {
      parallel {
        stage('PrintMessage::start') {
          steps {
            echo 'Pipeline has been already started!'
            sleep 30
            echo 'Finished'
          }
        }
        stage('Paralel::test') {
          steps {
            isUnix()
          }
        }
      }
    }
  }
}