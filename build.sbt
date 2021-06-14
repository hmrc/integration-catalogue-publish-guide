import uk.gov.hmrc.sbtdistributables.SbtDistributablesPlugin.publishingSettings

val appName = "integration-catalogue-publish-guide"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtAutoBuildPlugin, SbtGitVersioning, SbtDistributablesPlugin, SbtArtifactory)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    evictionWarningOptions in update := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0,
    scalaVersion  := "2.12.14"
  )
  .settings(
    publishingSettings: _*,
  )
