package imcamilo.github.com

import com.twitter.finagle.{Http, Service}
import com.twitter.util.Await
import imcamilo.github.com.service.EQCenterService
import io.circe.generic.auto._
import io.finch.circe._
import io.finch._
import io.finch.syntax._

import scala.collection.mutable.ListBuffer

object Scismo extends App {

  lazy val eqService = EQCenterService

  val dataEarth: Endpoint[ListBuffer[String]] = get("earth_quakes") {
    Ok(eqService.lastInformation())
  }

  val s = dataEarth.toServiceAs[Application.Json]

  Await.ready(Http.server.serve(":8081", dataEarth.toService))

}

