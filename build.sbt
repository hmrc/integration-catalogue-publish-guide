import play.sbt.routes.RoutesKeys

val appName = "integration-catalogue-publish-guide"

inThisBuild(
  List(
    scalaVersion := "2.13.13",
    semanticdbEnabled := false
  )
)


lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtAutoBuildPlugin, SbtGitVersioning, SbtDistributablesPlugin)
  .disablePlugins(JUnitXmlReportPlugin)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    update / evictionWarningOptions := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0,
    scalaVersion  := "2.13.13",
    RoutesKeys.routesImport := Seq.empty,
    Global / excludeLintKeys += update / evictionWarningOptions
  )
