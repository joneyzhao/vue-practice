pipeline {
	agent any
	stages {
		stage("install") {
			steps {
				echo "install"
				sh "npm install"
			}
		}
		stage("scan") {
			steps {
				echo "scan"
				sh "npm run lint"
			}
		}
		stage("test") {
			steps {
				echo "test"
				sh "npm run test:unit"
			}
		}
		stage("build") {
			steps {
				echo "build"
				sh "npm run build"
			}
		}
		stage("depoly") {
			steps {
				echo "deploy"
				echo "pwd"
			}
		}
	}
}
