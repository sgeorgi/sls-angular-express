import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "io.georgi"
ThisBuild / organizationName := "Sebastian Georgi"

lazy val root = (project in file("."))
  .settings(
    name := "serverless-angular-scala-be",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
