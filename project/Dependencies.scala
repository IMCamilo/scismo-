import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val jsoup = "org.jsoup" % "jsoup" % "1.8.3"
  lazy val finch = Seq(
    "com.github.finagle" %% "finch-core" % "0.22.0",
    "com.github.finagle" %% "finch-circe" % "0.22.0",
    "io.circe" %% "circe-generic" % "0.9.0"
  )
  lazy val configtypesafe =  "com.typesafe" % "config" % "1.3.2"
  lazy val scaldi = "org.scaldi" %% "scaldi" % "0.5.8"
}
