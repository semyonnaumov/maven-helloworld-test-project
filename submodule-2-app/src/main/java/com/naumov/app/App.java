package com.naumov.app;

import com.naumov.lib.LibUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(getText());
    }

    public static String getText() {
        return "Hello from submodule-2-app!" + " " + LibUtil.getLibText();
    }
}
