First MVN project in Eclipse
mvn clean
mvn package
java -cp target/firstmvn-1.0-SNAPSHOT.jar com.learnjava.firstmvn.App


mvn clean validate package

Available lifecycle phases are: 
validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, 
generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, 
package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy, pre-clean, clean, post-clean, pre-site, site, post-site, 
site-deploy. 

mvn -B archetype:generate -DarchetypeGroupId=org.learnjava -DgroupId=com.learnjava.app  -DartifactId=sample
mvn archetype:generate -DgroupId=com.learnjava.app -DartifactId=samplemvn -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
  