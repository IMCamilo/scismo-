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

  //hace scrapping de la tabla que está en internet y almacena los datos en un Document llamado tablePage
  val tablePage: Document = Jsoup.connect("http://www.sismologia.cl/links/tabla.html").get
  //ahora saca todos los tr de esa tabla
  val trElements: Elements = tablePage.getElementsByTag("tr")

  def lastInformation(): ListBuffer[String] = {
    //ahora saca todos los th de ese tr
    val thElements:Elements = trElements.select("th")
    //ahora saca todos los td de ese tr
    val tdElements:Elements = trElements.select("td")
    //map para almacenar los haders (que están en los th)
    var headers = Map(
      "date" -> thElements.get(0).text(),
      "place" -> thElements.get(1).text(),
      "magnitude" -> thElements.get(2).text())
    //almacena el valor de los td en la lista allData.
    var allData: ListBuffer[String] = ListBuffer()
    tdElements.forEach( row => { allData += row.text() })
    allData
  }

}
