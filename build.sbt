import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "imcamilo.com.github"
ThisBuild / organizationName := "objectlabs"

lazy val root = (project in file("."))
  .settings(
    name := "scismo",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      jsoup,
      finchxcore,
      finchxcirce,
      circe,
      scaldi)
  )