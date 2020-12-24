def call(String url branch) {
pipeline {
    agent none
    stages {
        stage('Checkout') {
            agent { label 'docker_linux' }
            steps {
              checkout([$class: 'GitSCM', branches: [[name: '*/"$branch"']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: "${url}"]]]) 
  
            }
           }
           }
}
}
