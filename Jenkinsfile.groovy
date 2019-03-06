pipeline {
	agent any
	stages {
		stage("安装依赖") {
			steps {
				echo "安装依赖"
				sh "npm install"
			}
		}
		stage("代码扫描") {
			steps {
				echo "代码扫描"
				sh "npm run lint"
			}
		}
		stage("单元测试") {
			steps {
				echo "单元测试"
				sh "npm run test:unit"
			}
		}
		stage("打包构建") {
			steps {
				echo "打包构建"
				sh "npm run build"
			}
		}
		stage("部署") {
			steps {
				echo "部署"
				echo "pwd"
			}
		}
	}
}
