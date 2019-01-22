package imcamilo.github.com.service

import com.twitter.util.Future
import imcamilo.github.com.model.EQCL
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

import scala.collection.mutable.ListBuffer

/**
  * Created by Camilo Jorquera on 20-01-19
  */
object EQCenterService {

  val tablePage: Document = Jsoup.connect("http://www.sismologia.cl/links/tabla.html").get
  val trElements: Elements = tablePage.getElementsByTag("tr")

  def lastInformation(): Future[ListBuffer[String]] = {
    val thElements:Elements = trElements.select("th")
    val tdElements:Elements = trElements.select("td")
    var headers = Map(
      "date" -> thElements.get(0).text(),
      "place" -> thElements.get(1).text(),
      "magnitude" -> thElements.get(2).text())
    var allData: ListBuffer[String] = ListBuffer()
    var count = 0
    tdElements.forEach( row => {
      allData += row.text()
      count += count
    })
    Future.value(allData)
  }

}
