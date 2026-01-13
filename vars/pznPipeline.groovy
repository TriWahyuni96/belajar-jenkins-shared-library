def call(Map config) {
    if(config.type = "maven") {
        mavenPipeline()

    } else {
        pipeline {
            agent any
            stages {
                stage("unsupported Type") {
                    steps {
                        script {
                            echo("Unsupported Type")
                        }
                    }
                }
            }
        }
    }
}