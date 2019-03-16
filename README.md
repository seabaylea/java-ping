## Java Microprofile Skeleton Project

This provides a skeleton project that uses the Java Microprofile platform definition. The Java Microprofile platform definition has three requirements:

1. Source code must be placed in `src/main/java`
You are free to use any package names and directory structure you wish under that directory. The skeleton provides two sample files: `MicroserviceConfiguration` and `HelloWorld` in the `knapp` package. These are samples and are not required.
2. Tests must be placed in `src/test/java` 
You are free to use any package names and directory structure you wish under that directory. 
3. Additional dependencies must be declared in `pom.xml`
This allows you to provide a **Maven module** that will be loaded into the final image. The module must have a `groupId` and `artifactId` of `extras`. The skeleton provides a `.pom.xml` file that can be renamed as `pom.xml` that adds the demo-bootstrap module from jitpack.io. This is a sample file and is not required.

## Developing a Java Microprofile project

Development of a Java Microprofile KnappPaks project can be done in any IDE, and is supported via the `knapp` CLI.

### Initializing the project

If you created the project using `knap dev init`, then all the required dependencies for the project have already been installed. If you have cloned the project directly, you should run:

* `knapp dev install`

which will install the required dependencies.

### Developing the project
Most testing of the Java Ping project has been done in VSCode with the Language Support for Java extension installed.

Your local KnappPaks project contains everything you need to develop locally in your IDE. Build, Run and Test then needs to be carried out in the KnappPaks continuous build environment.

To launch the continuous build environment, run:

* `knapp dev run`

This launches a Docker container that continuously re-builds and re-runs your project, exposing it on port 8080.

The following endpoints are also exposed as part of the Java Microprofile platform:

* Health Check: [http://localhost:8080/health](http://localhost:8080/health)
* Metrics: [http://localhost:8080/metrics](http://localhost:8080/metrics)
* Ping: [http://localhost:8080/server/ping](http://localhost:8080/server/ping)

**Note:** you can continue to edit the application in VSCode IDE. Changes will be reflected in the running container around 2 seconds after the changes are saved.