package com.thoughtworks;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    private static List<Rule> rules = Arrays.asList(
        new ContainSevenRule(),
        new ContainFiveRule(),
        new ContainThreeRule(),
        new DefaultRule()
    );

    public static String of(Integer number) {
        return Rule.find(rules, number)
            .value(number);
    }
}
