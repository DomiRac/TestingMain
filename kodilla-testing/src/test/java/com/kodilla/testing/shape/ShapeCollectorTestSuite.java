package com.kodilla.testing.shape;


import org.assertj.core.util.Arrays;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Before
    public static void before() {
        System.out.println("Test in progress...");
    }

    @After
    public static void after(){
        System.out.println("Test finished");
    }
    @Test
    public void testAddFigure(Shape shape) {
        ShapeCollector collector = new ShapeCollector(());
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
        Triangle triangle = new Triangle(4.4,3.3);
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);

        Shape figureNr2 = collector.getFigure(1);

        Assert.assertEquals(square, figureNr2);

    }
    @Test
    public void testShowFigures(){
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(5.5);
        Square square = new Square(4.4);
        Triangle triangle = new Triangle(4.4,3.3);
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);

        collector.showFigures();
    }
}
