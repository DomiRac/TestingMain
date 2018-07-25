package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void TestBigmacCustom() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(3)
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Tomato")
                .ingredient("Bacon")
                .ingredient("Jalapeno")
                .buld();

        System.out.println(bigmac);
        int hoManyIngredients = bigmac.getIngredients().size();
        Assert.assertEquals(4, hoManyIngredients);
    }
}