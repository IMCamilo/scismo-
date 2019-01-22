import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "imcamilo.github.com"
ThisBuild / organizationName := "objectlabs"

lazy val root = (project in file("."))
  .settings(
    name := "scismo",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies += jsoup
libraryDependencies ++= finch
libraryDependencies += configtypesafe
libraryDependencies += scaldi

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
