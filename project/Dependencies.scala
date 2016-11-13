import sbt._
import Keys._
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

object Dependencies {
  // Here are the versions used for the core project
  val scala210Version = "2.10.4"
  val scala211Version = "2.11.5"

  val picklingVersion = "0.10.1"
  val pickling = "org.scala-lang.modules" %% "scala-pickling" % picklingVersion

  private val jsonTuples = Seq(
    ("org.spire-math", "jawn-parser", "0.6.0"),
    ("org.spire-math", "json4s-support", "0.6.0")
  )

  val jsonDependencies = jsonTuples map {
    case (group, mod, version) => (group %% mod % version).exclude("org.scala-lang", "scalap")
  }

  val junitInterface       = "com.novocode" % "junit-interface" % "0.11"
}
