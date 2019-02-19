package imcamilo.com.github.service

import imcamilo.com.github.model.EQCL
import org.scalatest.FlatSpec

import scala.collection.mutable

/**
  * Created by Camilo Jorquera on 2/19/19
  */
class EQCenterServiceTest extends FlatSpec{

  val eqc = EQCenterService

  "lastInformation method" should "return a LinkedHashSet" in {
    val lastEQ = eqc.lastInformation()
    assert(lastEQ.isInstanceOf[mutable.LinkedHashSet[EQCL]])
  }

}
