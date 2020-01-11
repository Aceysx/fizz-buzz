package com.thoughtworks;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    private static Rule defaultRule = new DefaultRule();
    private static Rule containThreeRule = new ContainThreeRule();
    private static Rule containFiveRule = new ContainFiveRule();

    public static String of(Integer number) {

        String numberStr = String.valueOf(number);
        String result = "";
        if (containFiveRule.isValid(number)) {
            return containFiveRule.value(number);
        }
        if (containThreeRule.isValid(number)) {
            return containThreeRule.value(number);
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
