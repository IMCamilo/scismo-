package imcamilo.com.github

import cats.effect.IO
import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.http.{Request, Response}
import com.twitter.util.Await
import imcamilo.com.github.model.EQCL
import imcamilo.com.github.service.EQCenterServiceImp
import io.finch._
import io.finch.catsEffect._
import io.finch.circe._
import io.circe.generic.auto._

import scala.collection.mutable

object Scismo extends App {

  lazy val eqService = EQCenterServiceImp

  def eq: Endpoint[IO, mutable.LinkedHashSet[EQCL]] = get("eq") {
    Ok(eqService.lastInformation())
  }

  def information: Endpoint[IO, String] = get("version" :: path[String]) { s: String =>
    Ok(s)
  }

  def health: Endpoint[IO, String] = get(pathEmpty) {
    Ok("UP")
  }

  def service: Service[Request, Response] = Bootstrap
    .serve[Application.Json](eq :+: information :+: health)
    .toService

  Await.ready(Http.server.serve(":8081", service))

}
