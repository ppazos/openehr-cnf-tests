# openehr-cnf-tests-java-w-groovy

This is a cucumber-jvm project that also supports Groovy code. The JUnit test runner and cucumber steps are implemented in Java, but the logic called from the steps can be implemented in Groovy.

There is a simple Service.groovy class that is used from the Java steps. That makes logic to be written with less code and we can use Groovy libs like HTTPBuilder for writing tests.

```
$ mvn clean test
```
