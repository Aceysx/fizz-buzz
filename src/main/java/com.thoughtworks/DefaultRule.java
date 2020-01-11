package com.thoughtworks;

public class DefaultRule implements Rule {
    @Override
    public String value(Integer number) {
        return FIZZ;
    }

    @Override
    public boolean isValid(Integer number) {
        return String.valueOf(number).contains("3");
    }
}
