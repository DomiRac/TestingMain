package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);

        double result = calculator.add(5.7, 7.9);
        double result2 = calculator.sub(5.7, 7.9);
        double result3 = calculator.mul(5.7, 7.9);
        double result4 = calculator.div(5.7, 7.9);


        Assert.assertEquals(13.6, result, 0.001);
        Assert.assertEquals(-2.2, result2, 0.001);
        Assert.assertEquals(45.03, result3, 0.001);
        Assert.assertEquals(0.7215189873417721, result4, 0.001);
    }
}
