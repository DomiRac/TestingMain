package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //given
        int[] numbers = {1,3,7,9,13,17,24,28,36,38,44,47,55,56,68,70,88,89,101,136};

        //when
        double average = ArrayOperations.getAverage(numbers);

        //then
        Assert.assertEquals(46.5, average, 0.001);



    }
}
