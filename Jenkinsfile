@Library('mitun-library@master') _
 
pipeline {
	agent any
	stages {
           stage('Git Checkout') {
            steps {
            gitCheckout(
                branch: "master",
                url: "https://github.com/mitunmbj/shared-library.git"
                 )
            }
	}

	}}
