package de.tuan.euler.problem1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

/**
 * Created by M. Tuan Pham on 02.12.2015.
 */
public class JavaMultiplesAdderImpl implements MultiplesAdder {

    private List<Integer> ofValues;

    public JavaMultiplesAdderImpl(Integer... ofValues) {
        this.ofValues = Arrays.asList(ofValues);
    }

    @Override
    public long sumOfAllMultiples(long inputValue) {
        return LongStream.range(1, inputValue).filter(i -> ofValues.stream().anyMatch(of -> i % of == 0l)).sum();
    }

}
