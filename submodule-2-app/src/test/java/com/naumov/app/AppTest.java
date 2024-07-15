package com.naumov.app;

import com.naumov.app.App;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class AppTest {

    @Test
    public void shouldReturnCorrectText() {
        assertEquals(App.getText(), "Hello from submodule-2-app! Hello from submodule-1-lib!");
    }
}
