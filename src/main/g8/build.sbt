name := "$name$"

organization := "$organization$"

scalaVersion := "$scala_version$"

resolvers ++= Seq(
  DefaultMavenRepository,
  Resolver.bintrayRepo("typesafe", "releases"),
  Resolver.sonatypeRepo("releases"),
  Resolver.mavenLocal
)

val TypesafeConfigVersion = "1.3.0"
val ScalatestVersion = "2.2.4"
val ScalacheckVersion = "1.12.4"

libraryDependencies ++= Seq(
  "com.typesafe" %  "config" % TypesafeConfigVersion,
  "org.scalatest" %% "scalatest" % ScalatestVersion % "test",
  "org.scalacheck" %% "scalacheck" % ScalacheckVersion % "test"
)

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "$organization$.$name;format="lower,word"$"
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

initialCommands := "import $organization$.$name;format="lower,word"$._"

scalariformSettings
