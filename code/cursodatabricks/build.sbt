ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.20"

lazy val root = (project in file("."))
  .settings(
    name := "cursodatabricks"
  )

libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.19" % "test"