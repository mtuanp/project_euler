package de.tuan.euler.problem1

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSuite, Matchers}

/**
  * Created by M. Tuan Pham on 02.12.2015.
  */
@RunWith(classOf[JUnitRunner])
class ScalaMultiplesAdderImplTest extends FunSuite with Matchers {

  test("testSumOfAllMultiples") {
    val multiplier = new ScalaMultiplesAdderImpl(List(3,5))
    multiplier.sumOfAllMultiples(10) should be(23l)
  }

}
