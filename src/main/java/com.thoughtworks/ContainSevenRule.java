package com.thoughtworks;

public class ContainSevenRule implements Rule {
    @Override
    public String value(Integer number) {
        String result = "";
        if (number % 3 == 0) {
            result += FIZZ;
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
        return numberStr.contains("7") && !numberStr.contains("3");
    }
}
