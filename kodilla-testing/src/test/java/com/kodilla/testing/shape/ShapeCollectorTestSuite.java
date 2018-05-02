package com.kodilla.testing.shape;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Before
    public void before() {
        System.out.println("Test in progress...");
    }

    @After
    public void after() {
        System.out.println("Test finished");
    }

    @Test
    public void testAddFigure() {
        ShapeCollector collector = new ShapeCollector();

        Circle circle = new Circle(6.6);
        collector.addFigure(circle);

        Assert.assertEquals(1, collector.howManyFigures());
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square(3.3);

        collector.addFigure(square);
        boolean result = collector.removeFigure(square);

        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.howManyFigures());
    }

    @Test
    public void testGetFigure() {
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(6.6);
        Square square = new Square(4.4);
        Triangle triangle = new Triangle(4.4, 3.3);
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);

        Shape figureNr2 = collector.getFigure(1);

        Assert.assertEquals(square, figureNr2);

    }
}
