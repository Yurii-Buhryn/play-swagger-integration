name := """play-swagger"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "pl.matisoft" %% "swagger-play24" % "1.4"
)

routesGenerator := InjectedRoutesGenerator
