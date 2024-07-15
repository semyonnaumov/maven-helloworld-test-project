package com.naumov.lib;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class SimpleLibUtilTest {

    @Test
    public void shouldPass() {
        assertEquals(1 + "", "1");
    }
}
