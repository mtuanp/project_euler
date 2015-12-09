package de.tuan.euler.problem2

/**
  * Created by M. Tuan Pham on 09.12.2015.
  */
class ScalaProblem2Resolver extends Problem2Resolver {

  override def sumEvenFibonacciNumbers(maxNumber: Long): Long = recursiveSumEvenFibonacciNumbers(1, 2, maxNumber, 0)

  private def recursiveSumEvenFibonacciNumbers(fibonacciNumberA: Long, fibonacciNumberB: Long, maxNumber: Long, sum: Long): Long = {
    val newFibonacciNumber = fibonacciNumberA + fibonacciNumberB
    if (newFibonacciNumber > maxNumber) {
      return sum + (if (fibonacciNumberB % 2 == 0l) fibonacciNumberB else 0l)
    }
    recursiveSumEvenFibonacciNumbers(fibonacciNumberB, newFibonacciNumber, maxNumber,
      sum + (if (fibonacciNumberA % 2 == 0l) fibonacciNumberA else 0l))
  }
}
