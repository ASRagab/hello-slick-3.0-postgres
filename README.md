This is an edited template for [Typesafe Activator](http://typesafe.com/platform/getstarted).
***

#### **Changes Made:**
##### _build.sbt:_
```scala
libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.0.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc4",
  "com.zaxxer" % "HikariCP" % "2.3.8"
)
```

##### _application.conf:_

```scala
postgresDb = {
  dataSourceClass = "org.postgresql.ds.PGSimpleDataSource"
  properties = {
    serverName = "localhost"
    portNumber = "5432"
    databaseName = "<insert db name here>"
    user = "<db owner>"
    password = ""
  }
  numThreads = 10
}
```

##### _Imports:_
Remove H2.driver.api references replace with

```scala
import slick.driver.PostgresDriver.api._
```
PostgresDriver.simple is deprecated


##### _Slick PlainQueries:_

Change plainQuery syntax for postgres:

```scala
val plainQuery = sql"""select "SUP_NAME" from "SUPPLIERS" where "STATE" = $state""".as[String]
```

Triple quotes as postgres dbobjects are double quoted.
