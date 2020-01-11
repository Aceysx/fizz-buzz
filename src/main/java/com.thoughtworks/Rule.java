package com.thoughtworks;

public interface Rule {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    String value(Integer number);

    boolean isValid(Integer number);
}
