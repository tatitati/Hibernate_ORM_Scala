
name := """hibernate_project"""
organization := "com.example"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.7"

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
libraryDependencies += "org.hibernate" % "hibernate-core" % "5.3.7.Final"



// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
