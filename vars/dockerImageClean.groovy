def call(String hubUser, String project, String imageTag){
    sh """    
    docker rmi ${hubUser}/${project}:${imageTag}
    docker rmi ${hubUser}/${project}:latest
    """
}