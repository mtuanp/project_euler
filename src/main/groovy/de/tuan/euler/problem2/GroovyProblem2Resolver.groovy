package de.tuan.euler.problem2

import groovy.transform.TailRecursive

/**
 * Created by 7u4n on 03.12.2015.
 */
class GroovyProblem2Resolver implements Problem2Resolver {

    @Override
    long sumEvenFibonacciNumbers(long maxNumber) {
        recursiveSumEvenFibonacciNumbers(1, 2, maxNumber, 0)
    }

    @TailRecursive
    private long recursiveSumEvenFibonacciNumbers(long fibonacciNumberA, long fibonacciNumberB, long maxNumber, long sum) {
        long newFibonacciNumber = fibonacciNumberA + fibonacciNumberB;
        if (newFibonacciNumber > maxNumber) {
            sum + ((fibonacciNumberB % 2 == 0l) ? fibonacciNumberB : 0l);
        }
        recursiveSumEvenFibonacciNumbers(fibonacciNumberB, newFibonacciNumber, maxNumber,
                sum + ((fibonacciNumberA % 2 == 0l) ? fibonacciNumberA : 0l))
    }

}
