val common = Seq(
  version := "1.0",
  scalaVersion := "2.13.2",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

parallelExecution in Test := false

lazy val root = project
  .in(file("."))
  .aggregate(Lab1, Lab2, Lab3, Lab4)
  .settings(common)
lazy val Lab1 = project
  .settings(common)

lazy val Lab2 = project
  .settings(common)

lazy val Lab3 = project
  .settings(common)

lazy val Lab4 = project
  .settings(common)