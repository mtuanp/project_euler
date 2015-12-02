package de.tuan.euler.problem1

/**
 * Created by M. Tuan Pham on 02.12.2015.
 */
class GroovyMultiplesAdderImpl implements MultiplesAdder {

    final long[] ofValues

    GroovyMultiplesAdderImpl(long[] ofValues) {
        this.ofValues = ofValues
    }

    @Override
    long sumOfAllMultiples(long inputValue) {
        (1..inputValue - 1).findAll { index -> ofValues.any { index % it == 0l } }.sum()
    }

}
