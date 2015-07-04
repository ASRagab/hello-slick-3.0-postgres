name := "hello-slick"

mainClass in Compile := Some("HelloSlick")

scalaVersion := "2.11.6"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.0.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc4",
  "com.zaxxer" % "HikariCP" % "2.3.8"
)
