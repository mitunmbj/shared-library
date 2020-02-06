def call(String project, String hubUser) {
    sh "docker build -t mitun.azurecr.io/ubuntu:latestone ."
    withCredentials([usernamePassword(
            credentialsId: "docker-registery",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u mitun -p 5opvsXZVvPk94tCoasrBbUy4M0dVFFL/ mitun.azurecr.io"
    }
    sh "docker push mitun.azurecr.io/ubuntu:latestone"
}
