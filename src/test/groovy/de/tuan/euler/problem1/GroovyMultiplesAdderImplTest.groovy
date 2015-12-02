package de.tuan.euler.problem1

import spock.lang.Specification

/**
 * Created by M. Tuan Pham on 02.12.2015.
 */
class GroovyMultiplesAdderImplTest extends Specification {
    MultiplesAdder multiplier

    def setup() {
        multiplier = new GroovyMultiplesAdderImpl(3, 5)
    }

    def "SumOfAllMultiples"() {
        expect:
            multiplier.sumOfAllMultiples(10) == 23l
    }
}
