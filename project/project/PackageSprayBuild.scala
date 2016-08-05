import sbt._

object PackageSprayBuild extends Build {
  lazy val root = Project("finagles-server", file(".")) dependsOn docker
  lazy val docker = file("../..").getAbsoluteFile.toURI
}
