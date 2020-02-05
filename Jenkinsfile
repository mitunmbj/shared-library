@Library('mitun-library@master') _
 
pipeline {
           stage('Git Checkout') {
            steps {
            gitCheckout(
                branch: "master",
                url: "https://github.com/mitunmbj/shared-library.git"
                 )
            }
	}

 	stage('Docker build') {
  		sh "docker build --rm -f Dockerfile -t mitun.azurecr.io/ubuntu:latest ."
		}
    stage ('Push Docker Image'){
    withCredentials([usernameColonPassword(credentialsId: 'githucred', variable: 'mitunacr')]) {
        sh "docker login -u mitun -p ${mitunacr} mitun.azurecr.io"
        }
        sh 'docker push mitun.azurecr.io/ubuntu:latest'
      	sh 'docker rmi mitun.azurecr.io/ubuntu:latest'
    }

 	stage('Deploy the container') {
  		sh "ssh -t -t root@13.68.225.131 /home/mitunmbj/deploy.sh"
 		}
	}
