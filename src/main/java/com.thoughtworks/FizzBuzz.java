package com.thoughtworks;

public class FizzBuzz {
    private static Rule defaultRule = new DefaultRule();
    private static Rule containThreeRule = new ContainThreeRule();
    private static Rule containFiveRule = new ContainFiveRule();

    public static String of(Integer number) {
        if (containFiveRule.isValid(number)) {
            return containFiveRule.value(number);
        }
        if (containThreeRule.isValid(number)) {
            return containFiveRule.value(number);
        }

        return defaultRule.value(number);
    }
}
