def call(checkout) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name: 'master' ]],
        userRemoteConfigs: [[ url: 'https://github.com/mitunmbj/shared-library.git' ]]
    ])
  }
