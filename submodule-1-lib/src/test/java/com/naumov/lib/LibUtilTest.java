package com.naumov.lib;

import static org.testng.Assert.assertEquals;

import com.naumov.lib.LibUtil;
import org.testng.annotations.Test;

@Test
public class LibUtilTest {

    @Test
    public void shouldReturnCorrectText() {
        assertEquals(LibUtil.getLibText(), "Hello from submodule-1-lib!");
    }
}
