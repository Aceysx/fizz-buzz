package com.thoughtworks;

public class ContainFiveRule implements Rule {
    @Override
    public String value(Integer number) {
        String result = "";
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
        String numberStr = String.valueOf(number);
        return numberStr.contains("5") && !numberStr.contains("7");
    }
}
