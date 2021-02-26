package com.home.delegate;

public class DemoDelegate {
    private static int counter=1;
    public String helper()
    {
        return "Spring Boot user no "+counter++;
    }
}
