name := "reader-monad"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions += "-Ypartial-unification" // 2.11.9+

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core"        % "1.0.1",
  "org.slf4j"     % "slf4j-api"         % "1.7.25",
  "org.scalatest" %% "scalatest"        % "3.0.4" % Test
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")