package de.tuan.euler.problem1;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by M. Tuan Pham on 02.12.2015.
 */
public class JavaMultiplesAdderImplTest {

    private MultiplesAdder multiplesAdder;

    @Test
    public void testListAllMultiples() throws Exception {
        multiplesAdder = new JavaMultiplesAdderImpl(3, 5);
        long resultValue = multiplesAdder.sumOfAllMultiples(10);
        assertThat(resultValue, is(IsEqual.equalTo(23l)));
    }
}