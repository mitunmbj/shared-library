def call(String url) {
pipeline {
    agent none
    stages {
        stage('Checkout') {
            agent none
            steps {
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: '$url']]]) 
  
            }
           }
           }
}
}
