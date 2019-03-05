pipeline {
	agent any
	
	stages {
		stage('代码扫描') {
			steps {
				echo "代码扫描"
				sh "npm run lint"
			}
		}
		stage('单元测试') {
			steps {
				echo "单元测试"
			}
		}
		stage('打包构建') {
			steps {
				echo "打包构建"
			}
		}
		stage('部署') {
			steps {
				echo "部署"
			}
		}
	}
}
