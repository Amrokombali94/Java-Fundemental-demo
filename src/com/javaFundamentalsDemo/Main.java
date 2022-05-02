package com.javaFundamentalsDemo;

public class Main {
    public static void main(String[] args) {
        DroidFactory droidFactory = new DroidFactory("R2D2");
        System.out.println(droidFactory);
        System.out.println(droidFactory.speak("R2D2"));
    }
}
