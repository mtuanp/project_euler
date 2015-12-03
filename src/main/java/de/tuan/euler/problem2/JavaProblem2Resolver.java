package de.tuan.euler.problem2;

/**
 * Created by M. Tuan Pham on 02.12.2015.
 */
public class JavaProblem2Resolver implements Problem2Resolver {

    @Override
    public long sumEvenFibonacciNumbers(long maxNumber) {
        return recursiveSumEvenFibonacciNumbers(1, 2, maxNumber);
    }

    private long recursiveSumEvenFibonacciNumbers(long fibonacciNumberA, long fibonacciNumberB, long maxNumber) {
        long newFibonacciNumber = fibonacciNumberA + fibonacciNumberB;
        if (newFibonacciNumber > maxNumber) {
            return fibonacciNumberB;
        } else {
            long newFibonacciNumberB = recursiveSumEvenFibonacciNumbers(fibonacciNumberB, newFibonacciNumber, maxNumber);
            return ((fibonacciNumberB % 2 == 0) ? fibonacciNumberB : 0) +
                    ((newFibonacciNumberB % 2 == 0) ? newFibonacciNumberB : 0);
        }
    }

}
