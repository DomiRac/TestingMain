package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void log() {
        Logger.getInstance().log("This is a log");
    }

    @Test
    public void testGetLastLog() {
        String lastLog = Logger.getInstance().getLastLog();

        Assert.assertEquals("This is a log", lastLog);

    }
}
