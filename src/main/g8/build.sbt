import com.typesafe.sbt.SbtStartScript

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

val TypesafeConfigVersion = "1.2.0"
val ScalatestVerison = "2.1.7"
val ScalacheckVersion = "1.11.4"

libraryDependencies ++= Seq(
  "com.typesafe" %  "config" % TypesafeConfigVersion,
  "org.scalatest" % "scalatest" %% ScalaTestVersion % "test",
  "org.scalacheck" %% "scalacheck" % ScalacheckVersion % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

scalariformSettings

seq(SbtStartScript.startScriptForClassesSettings: _*)
