def call(String hubUser, String project, String imageTag){
    sh """
    trivy image ${hubUser}/${project}:latest > scan.txt
    cat scan.txt
    
    """
}