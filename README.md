Akka DI with Guice and Scala
============================

Fork Modifications
------------------
Modified to allow use as a project dependency.

Check-out and run "activator publishLocal" to build to local ivy repo.

Add as a dependency to your project build.sbt:

	"akkaguice" % "activator-akka-scala-guice_2.11" % "1.0"


Original Readme Start
---------------------

Demonstrates how to do Akka Dependency Injection with Guice and Scala.

This template is based on the [akka-java-spring](https://github.com/typesafehub/activator-akka-java-spring) 
template.

Setup
-----

1. [Download Typesafe Activator](http://typesafe.com/platform/getstarted) (or copy it over from a USB)
2. Extract the zip and run the `activator` or `activator.bat` script from a non-interactive shell
3. Your browser should open to the Activator UI: [http://localhost:8888](http://localhost:8888)

Open in an IDE
--------------

If you want to use an IDE (Eclipse or IntelliJ), click on *Code*, select *Open*, and then select your IDE.
This will walk you through the steps to generate the project files and open the project. Alternatively you
can edit files in the Activator UI.
