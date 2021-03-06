val scala3Version = "3.1.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "csv-processing",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test" % "org.apache.spark" % "spark-sql" % "3.2.1" % "provided", // for spark-sql
  )
