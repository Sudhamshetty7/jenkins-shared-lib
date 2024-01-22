def call(){
    echo "SonarQube Analysis"
    sh '''
      mvn clean package sonar:sonar
    '''
}
