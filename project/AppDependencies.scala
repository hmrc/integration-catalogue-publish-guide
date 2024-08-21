import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  private val bootstrapPlayVersion = "9.3.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc"       %% "bootstrap-frontend-play-30"     % bootstrapPlayVersion
  )

  val test: Seq[ModuleID] = Seq(
    "org.pegdown" % "pegdown" % "1.6.0" % "test",
    "uk.gov.hmrc"             %% "bootstrap-test-play-30"  % bootstrapPlayVersion % "test"
  )
}
