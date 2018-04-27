package com.kodilla.testing.collection;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> result = exterminator.exterminate(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Assert.assertEquals(Arrays.asList(2,4,6,8), result);


    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> result = exterminator.exterminate(Arrays.asList());
        Assert.assertEquals(Arrays.asList(), result);

    }
}
