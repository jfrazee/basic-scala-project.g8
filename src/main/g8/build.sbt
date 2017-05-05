name := "$name$"

organization := "$organization$"

scalaVersion := "$scala_version$"

resolvers ++= Seq(
  DefaultMavenRepository,
  Resolver.bintrayRepo("typesafe", "releases"),
  Resolver.sonatypeRepo("releases"),
  Resolver.mavenLocal
)

val TypesafeConfigVersion = "1.3.1"
val ScalatestVersion = "3.0.1"
val ScalacheckVersion = "1.13.4"
val JodaConvertVersion = "1.8"

libraryDependencies ++= Seq(
  "com.typesafe" %  "config" % TypesafeConfigVersion,
  "org.joda" % "joda-convert" % JodaConvertVersion,
  "org.scalatest" %% "scalatest" % ScalatestVersion % "test",
  "org.scalacheck" %% "scalacheck" % ScalacheckVersion % "test"
)

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "$organization$"
  )

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)

initialCommands := "import $organization$._"

scalariformSettings
