package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        User kiddie = new Millenials("Kiddie");
        User kiddiesGrandma = new ZGeneration("Granny");
        User albert = new YGeneration("Albert");

        String kiddieShouldUse = kiddie.sharePost();
        System.out.println("Kiddie probably uses: " + kiddieShouldUse);
        String kiddiesGrandmaShouldUse = kiddiesGrandma.sharePost();
        System.out.println("Kiddies Grandma probably uses: " + kiddiesGrandmaShouldUse);
        String albertShoukdUse = albert.sharePost();
        System.out.println("Albert probably uses: " + albertShoukdUse);

        Assert.assertEquals("Snapchat", kiddieShouldUse);
        Assert.assertEquals("Twitter", kiddiesGrandmaShouldUse);
        Assert.assertEquals("Facebook", albertShoukdUse);
    }

    @Test
    public void testIndividualSharingStrategy() {

        User kiddie = new Millenials("Kiddie");

        String kiddieShouldUse = kiddie.sharePost();
        System.out.println("Kiddie probabely uses: " + kiddieShouldUse);
        kiddie.setSocialPublisher(new FacebookPublisher());
        kiddieShouldUse = kiddie.sharePost();
        System.out.println("Kiddie probably uses now: " + kiddieShouldUse);

    }
}
