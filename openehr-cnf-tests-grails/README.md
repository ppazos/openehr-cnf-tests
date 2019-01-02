# openehr-cnf-tests

openEHR Conformance Tests

Install and run:

    $ curl -s "https://get.sdkman.io" | bash
    $ source "$HOME/.sdkman/bin/sdkman-init.sh"
    $ sdk install grails 2.5.6
    $ git clone https://github.com/ppazos/openehr-cnf-tests.git
    $ cd openehr-cnf-tests
    $ grails run-app

Run tests from another terminal:

    $ cd openehr-cnf-tests
    $ grails
    $ grails> test-app :cucumber
    $ grails> open test-report
    $ grails> exit
