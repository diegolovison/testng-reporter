This repository demonstrate an issue related with testNG

- https://stackoverflow.com/questions/31476604/testng-all-subsequent-test-classes-are-skipped-when-beforeclass-method-fails
- https://github.com/cbeust/testng/issues/1755
- https://github.com/cbeust/testng/issues/1754

When we execute `mvn clean install` we are expecting an error because the method annotated with `@BeforeClass` throws a NullPointerException.

```java
   @BeforeClass
   public void prepareTest() {
      throw new NullPointerException();
   }
```

The result of the command `mvn clean install` is:

```text
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building testng-reporter 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ testng-reporter ---
[INFO] Deleting /storage/git/testng-reporter/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ testng-reporter ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /storage/git/testng-reporter/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ testng-reporter ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /storage/git/testng-reporter/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ testng-reporter ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /storage/git/testng-reporter/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ testng-reporter ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /storage/git/testng-reporter/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ testng-reporter ---
[INFO] Surefire report directory: /storage/git/testng-reporter/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.github.diegolovison.testngreporter.FooTest
Configuring TestNG with: TestNG652Configurator
Tests run: 0, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.203 sec - in com.github.diegolovison.testngreporter.FooTest

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ testng-reporter ---
[INFO] Building jar: /storage/git/testng-reporter/target/testng-reporter-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ testng-reporter ---
[INFO] Installing /storage/git/testng-reporter/target/testng-reporter-1.0-SNAPSHOT.jar to /home/diego/.m2/repository/com/github/diegolovison/testng-reporter/1.0-SNAPSHOT/testng-reporter-1.0-SNAPSHOT.jar
[INFO] Installing /storage/git/testng-reporter/pom.xml to /home/diego/.m2/repository/com/github/diegolovison/testng-reporter/1.0-SNAPSHOT/testng-reporter-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.959 s
[INFO] Finished at: 2018-06-07T10:16:00-03:00
[INFO] Final Memory: 17M/209M
[INFO] ------------------------------------------------------------------------

```