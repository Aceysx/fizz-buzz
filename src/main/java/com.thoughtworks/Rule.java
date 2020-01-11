package com.thoughtworks;

import java.util.List;

public interface Rule {
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String WHIZZ = "Whizz";

    String value(Integer number);

    boolean isValid(Integer number);

    static Rule find(List<Rule> rules, Integer number) {
        return rules.stream()
            .filter(rule -> rule.isValid(number))
            .findFirst()
            .orElse(new DefaultRule());
    }
}
