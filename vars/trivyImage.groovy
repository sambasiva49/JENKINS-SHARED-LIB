def call() {
    sh 'trivy image sambasiva49/youtube:latest > trivyimage.txt'
}
