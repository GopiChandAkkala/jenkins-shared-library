def call(String hubUser, String project, String imageTag){
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh "docker login -u '$USER' -p '$PASS'"
    }
    sh 'docker push ${hubUser}/${project}:${imageTag}'
    sh 'docker push ${hubUser}/${project}:latest '
}