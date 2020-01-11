package com.thoughtworks;

import com.thoughtworks.rule.*;

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
        String result = Rule.find(rules, number)
            .value(number);
        return result.isEmpty()
            ? String.valueOf(number)
            : result;
    }
}
