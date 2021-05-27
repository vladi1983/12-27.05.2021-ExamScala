name := "PlayScala"
version := "1.0"
scalaVersion := "2.12.2"
      
lazy val `playscala` = (project in file(".")).enablePlugins(PlayScala)
libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )
unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

libraryDependencies += "org.apache.poi" % "poi" % "4.1.2"
libraryDependencies += "org.apache.poi" % "poi-ooxml-schemas" % "4.1.2"
libraryDependencies += "io.spray" %% "spray-json" % "1.3.5"

