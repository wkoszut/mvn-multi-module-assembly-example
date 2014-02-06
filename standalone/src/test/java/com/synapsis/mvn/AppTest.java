package com.synapsis.mvn;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/** Unit test for simple App. */
public class AppTest {

    @BeforeClass
    public static void testSetup() {
    }

    @Test
    public void testApp() {
        assertTrue(new App().logSomething());
    }
}
