## Simple Maven Commands

1. Clean the Project: mvn clean 

2. Compile the Project: mvn compile
3. Test The Project: mvn test
4. Package the Project: mvn package
5. Install porject in locally: mvn install
6. Deploye the project to a remote repository: mvn deploy
7. Validate the project: mvn validate
8. Run the project: mvn exec:java
9. Generate Site Doucmentation: mvn site
10. Clean and Install: mvn clean install
11. Generate Project from Archetype: mvn archetype:generate
12. Run specific Phase (clean, install, test): mvn <phase>
13. Skip Test: mvn install -DskipTests
14. Display Dependency Tree: mvn dependency:tree
15. Show Effective Pom: mvn help:effective-pom
16. Create a Dependency Report: mvn dependency:report
17. Build the Project for Specific Profile: mvn clean install -P <profile-name>
18. Run the Project with a Specific Version of a Plugin: mvn exec:java -Dexec.mainClass="com.example.Main" -Dexec.version=1.0

19. Update the Projct Dependencies: mvn clean install -U
20.  Show All Available Goals for a Plugin: mvn <plugin-name>:help; Like: mvn compiler:help
21. Run Maven with Debug Output: mvn -X <goal>; mvn -X clean install

22. Skip tests and compile only:  mvn compile -DskipTests
23. Generate a JAR with Dependencies (using shade plugin): mvn package shade:shade
24. Run the Project with a Specific Profile: mvn clean install -P <profile-name>
25.  List the Project's Plugins: mvn plugins
26. Check for Dependency Versions: mvn dependency:list
27. Run with custom properties: mvn clean install -DpropertyName=value
28. Download Dependencies Without Building the Project: mvn dependency:resolve
29. Check the Dependency Versions for Compatibility: mvn versions:display-dependency-updates

30. Update a Specific Dependency Version: mvn versions:use-latest-versions -Dincludes=<groupId>:<artifactId>
31. Run a Custom Maven Plugin Goal: mvn <plugin-name>:<goal-name>

32. 