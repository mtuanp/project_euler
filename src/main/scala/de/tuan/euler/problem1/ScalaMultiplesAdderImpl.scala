package de.tuan.euler.problem1

/**
  * Created by M. Tuan Pham on 02.12.2015.
  */
class ScalaMultiplesAdderImpl(ofValues: List[Int]) extends MultiplesAdder {

  override def sumOfAllMultiples(inputValue: Long): Long = (1l until inputValue).filter((i: Long) => ofValues.exists(i % _ == 0)).sum

}