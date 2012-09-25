name := "Scala.React"

version := "1.0"

scalaVersion := "2.10.0-M7"

resolvers += ("releases" at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++= Seq(
	"org.joda" % "joda-convert" % "1.2",
	"joda-time" % "joda-time" % "2.1",
	"org.scala-tools" % "scala-stm_2.10.0-M7" % "0.6")
