package imcamilo.github.com

import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.http.filter.JsonpFilter
import com.twitter.util.{Await, Future}
import imcamilo.github.com.model.EQCL
import imcamilo.github.com.service.EQCenterService
import io.circe.generic.auto._
import io.finch.circe._
import io.finch._
import io.finch.syntax._

import scala.collection.mutable.ListBuffer

object Scismo extends App {

  lazy val eqService = EQCenterService

  val dataEarth: Endpoint[Future[ListBuffer[String]]] = get("time") {
    Ok(eqService.lastInformation())
  }

  val service: Service[Request, Response] = JsonpFilter.andThen(dataEarth.toServiceAs[Application.Json])

  Await.ready(Http.server.serve(":8081", dataEarth.toService))

}

