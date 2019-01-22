import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "imcamilo.github.com"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scismo",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies += jsoup
libraryDependencies ++= finchdependencies

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
