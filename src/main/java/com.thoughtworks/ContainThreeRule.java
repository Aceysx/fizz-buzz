package com.thoughtworks;

public class ContainThreeRule implements Rule {
    @Override
    public String value(Integer number) {
        String result = "";
        if (number % 3 == 0) {
            result += FIZZ;
        }
        if (number % 5 == 0) {
            result += BUZZ;
        }
        if (number % 7 == 0) {
            result += WHIZZ;
        }
        return result.isEmpty()
            ? String.valueOf(number)
            : result;
    }

    @Override
    public boolean isValid(Integer number) {
        return true;
    }
}
