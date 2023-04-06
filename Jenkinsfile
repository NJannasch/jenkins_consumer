def pipeline
node('master') {
    stage('Checkout Common Pipeline Logic') {
        steps {
            sh 'mkdir -p CommonLogic'
            dir("CommonLogic")
            {
                git branch: "develop",
                credentialsId: 'aaa',
                url: 'git@a.com:b/CommonLogic.git' // common pipeline logic in groovy
            }
        }
    }

    stage('Checkout Frontend') {
        steps {
            sh 'mkdir -p frontend'
            dir("frontend")
            {
                git branch: "develop",
                credentialsId: 'aaa',
                url: 'git@a.com:b/module1.git'  // Frontend reporitory git
            }
        }
    }


    stage('Compliance') {
        steps {
            // Some calls from the developers
            // sh ...

            // Central maintained logic
            common_logic = load 'CommonLogic/same_logic_file.groovy'
            common_logic.custom_compliance_check()
        }
    }
}
