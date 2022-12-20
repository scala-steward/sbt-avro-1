import sbt._

object Dependencies {

  object Versions {
    val Avro = "1.11.0"
    val Specs2 = "4.19.0"
  }

  object Provided {
    val AvroCompiler =  "org.apache.avro" % "avro-compiler" % Versions.Avro % "provided"
  }

  object Test {
    val Specs2Core = "org.specs2" %% "specs2-core" % Versions.Specs2 % "test"
  }
}
