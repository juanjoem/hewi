// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "clojars" at "http://clojars.org/repo/"

resolvers += "clojure-releases" at "http://build.clojure.org/releases"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

val clojureScriptLibs = Seq()

libraryDependencies ++= clojureScriptLibs

// Use the Play sbt plugin for Play projects //
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")

addSbtPlugin("io.github.petro-rudenko" % "play-clojurescript" % "0.0.1")

//Code style and Unit test coverage tools.
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.2")

addSbtPlugin("com.github.scct" % "sbt-scct" % "0.3-SNAPSHOT")
