node {
 	stage('SCM checkout') {
		git credentialsId: '', url: ''
 		}
 	stage('Docker build') {
  		sh "docker build --rm -f Dockerfile -t mitun.azurecr.io/ubuntu:latest ."
		}
    stage ('Push Docker Image'){
    withCredentials([string(credentialsId: 'Docker_sr', variable: 'Docker_1')]) {
        sh "docker login -u PlatformImage -p ${Docker_1} platformimage.azurecr.io"
        }
        sh 'docker push mitun.azurecr.io/ubuntu:latest'
      	sh 'docker rmi mitun.azurecr.io/ubuntu:latest'
    }

 	stage('Deploy the container') {
  		sh "ssh -t -t root@13.68.225.131 /home/mitunmbj/deploy.sh"
 		}
	}
