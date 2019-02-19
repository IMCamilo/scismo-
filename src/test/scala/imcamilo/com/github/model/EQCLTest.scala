package imcamilo.com.github.model

import org.scalatest.FlatSpec

/**
  * Created by Camilo Jorquera on 2/19/19
  */
class EQCLTest extends FlatSpec {

  "EQCL class" should "contains the correct values" in {
    val eqcl = EQCL("2019/02/19 08:33:22", "155 km al O de Tirúa", "3.7 Ml")
    assert(eqcl.localDate === "2019/02/19 08:33:22")
  }

}