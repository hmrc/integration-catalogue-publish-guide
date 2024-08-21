import play.sbt.routes.RoutesKeys

val appName = "integration-catalogue-publish-guide"

inThisBuild(
  List(
    scalaVersion := "3.4.2",
    semanticdbEnabled := false
  )
)


lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .disablePlugins(JUnitXmlReportPlugin)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    update / evictionWarningOptions := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0,
    scalaVersion  := "3.4.2",
    RoutesKeys.routesImport := Seq.empty,
    Global / excludeLintKeys += update / evictionWarningOptions
  )
