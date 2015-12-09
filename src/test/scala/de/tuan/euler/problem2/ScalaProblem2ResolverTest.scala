package de.tuan.euler.problem2

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSuite}

/**
  * Created by M. Tuan Pham on 09.12.2015.
  */
@RunWith(classOf[JUnitRunner])
class ScalaProblem2ResolverTest extends FunSuite with Matchers {

  test("testSumEvenFibonacciNumbers") {
    val resolver = new ScalaProblem2Resolver()
    resolver.sumEvenFibonacciNumbers(100) should be(44l)
  }

}
