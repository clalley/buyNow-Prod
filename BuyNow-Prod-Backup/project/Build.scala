import sbt._
import Keys._
import play.Project._
import play.api._

object ApplicationBuild extends Build {


  val appName         = "demo1"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
 "org.jumpmind.symmetric.jdbc" % "postgresql" % "9.2-1002-jdbc4"

  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here   
    
    templatesImport += "models.BuyNowData"   
  )

}
