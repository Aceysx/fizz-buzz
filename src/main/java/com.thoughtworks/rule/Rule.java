package com.thoughtworks.rule;

import java.util.List;

public interface Rule {
    String value(Integer number);

    boolean isValid(Integer number);

    static Rule find(List<Rule> rules, Integer number) {
        return rules.stream()
            .filter(rule -> rule.isValid(number))
            .findFirst()
            .orElse(new DefaultRule());
    }
}
