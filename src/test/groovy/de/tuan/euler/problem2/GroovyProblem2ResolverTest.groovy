package de.tuan.euler.problem2

import spock.lang.Specification

/**
 * Created by 7u4n on 03.12.2015.
 */
class GroovyProblem2ResolverTest extends Specification {
    def "SumEvenFibonacciNumbers"() {
        setup:
            Problem2Resolver resolver = new GroovyProblem2Resolver()
        expect:
            resolver.sumEvenFibonacciNumbers(100l) == 44l
    }
}
