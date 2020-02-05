def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }

[docker build --rm -f Dockerfile -t mitun.azurecr.io/ubuntu:latest .].execute()
