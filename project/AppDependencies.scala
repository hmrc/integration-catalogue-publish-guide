import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val bootStrapPlayVersion = "7.20.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootStrapPlayVersion)

  val test: Seq[ModuleID] = Seq(
    "org.pegdown" % "pegdown" % "1.6.0" % "test",
    "uk.gov.hmrc" %% "bootstrap-test-play-28" % bootStrapPlayVersion % "test")
}
