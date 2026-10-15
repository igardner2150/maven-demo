package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "Hello, Maven!";

        System.out.println(StringUtils.repeat("=", 25));
        System.out.println("Original:       " + message);
        System.out.println("upperCase:      " + StringUtils.upperCase(message));
        System.out.println("swapCase:       " + StringUtils.swapCase(message));
        System.out.println("abbreviate(8):  " + StringUtils.abbreviate(message, 8));
        System.out.println("center(21,'*'): " + StringUtils.center(message, 21, '*'));
        System.out.println("rotate(3):      " + StringUtils.rotate(message, 3));
        System.out.println("deleteWhitespace: " + StringUtils.deleteWhitespace(message));
        System.out.println("count of 'l':   " + StringUtils.countMatches(message, 'l'));
        System.out.println(StringUtils.repeat("=", 25));
    }
}