Hello Spring
============

This is a bare-bones Java project that uses Gradle as a build system.  It assumes that Gradle is already installed on your system. On Mac OSX, you can install Gradle via `brew install gradle`.  On Debian-based Linux system, it's probably `apt-get install gradle`.

To build the project, run the command `./gradlew build`.

Once the project has been built, you can run the Tomcat/Spring-boot server via the command `java -jar build/libs/hello-spring-0.1.0.jar`.  Once the server is running, go to `http://localhost:8080/greeting` in your favorite browser.

