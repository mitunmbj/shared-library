def call(String url) {
pipeline {
    agent none
    stages {
        stage('Checkout') {
            agent { label 'docker_linux' }
            steps {
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: "${url}"]]]) 
  
            }
           }
           }
}
}
