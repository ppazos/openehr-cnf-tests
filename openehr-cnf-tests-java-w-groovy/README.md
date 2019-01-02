# openehr-cnf-tests-java-w-groovy

This is a cucumber-jvm project that also supports Groovy code. The JUnit test runner and cucumber steps are implemented in Java, but the logic called from the steps can be implemented in Groovy.

There is a simple Service.groovy class that is used from the Java steps. That makes logic to be written with less code and we can use Groovy libs like HTTPBuilder for writing tests.

```
$ mvn clean test
```

## Some references

1. Followed this guide to add groovy support for maven: http://docs.groovy-lang.org/latest/html/documentation/tools-groovyc.html

2. mvn test did not run the JUnit runner, instead a TestNG tried to run, and JUnit was ignored.

3. Checking the dependencies: mvn dependency:tree saw groovy-all to have a dependency to testng.

4. Also found this issue mentioning these dependencies: https://github.com/groovy/groovy-eclipse/issues/665#issuecomment-410707338

5. Added exclusions for testng, tests and tests-junit5 on the POM, for the groovy-all and that made mvn test work.
