name := "Scala.React"

version := "1.0"

scalaVersion := "2.10.0-M7"

resolvers += ("releases" at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++= Seq(
	"org.joda" % "joda-convert" % "1.2",
	"joda-time" % "joda-time" % "2.1",
	"org.scala-tools" % "scala-stm_2.10.0-M7" % "0.6",
	"org.scalatest" % "scalatest_2.10.0-M7" % "1.9-2.10.0-M7-B1" % "test",
	"org.scalamock" % "scalamock-scalatest-support_2.9.2" % "2.4",
	"junit" % "junit" % "4.8.1" % "test",
	"org.scala-lang" % "scala-reflect" % "2.10.0-M7")
