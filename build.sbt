name := "Probabilistic"

organization := "com.deploymentzone"

version := "0.0.1"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.cra.figaro" % "figaro" % "2.1.0.0" withSources() withJavadoc(),
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc()
)

initialCommands := "import com.deploymentzone.probabilistic._"

