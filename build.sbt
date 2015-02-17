name := "library_test"

version := "1.0"

scalaVersion := "2.11.5"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.3.4",
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.3",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "org.slf4j" % "slf4j-simple" % "1.6.4",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
  "com.github.tototoshi" %% "scala-csv" % "1.2.0"
)