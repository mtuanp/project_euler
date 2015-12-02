package de.tuan.euler.problem2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by M. Tuan Pham on 02.12.2015.
 */
public class JavaProblem2ResolverTest {

    @Test
    public void testSumFibonacciNumbers() throws Exception {
        Problem2Resolver resolver = new JavaProblem2Resolver();
        long result = resolver.sumFibonacciNumbers(100l);
        assertThat(result, is(equalTo(44l)));
    }
}