package com.thoughtworks;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public static String of(Integer number) {
        String numberStr = String.valueOf(number);
        String result = "";
        if (numberStr.contains("5") && !numberStr.contains("7")) {
            if (number % 5 == 0) {
                result += BUZZ;
            }
            if (number % 7 == 0) {
                result += WHIZZ;
            }
            return result.isEmpty() ? numberStr : result;
        }
        if (numberStr.contains("3")) {
            return FIZZ;
        }
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
}
