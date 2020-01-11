package com.thoughtworks.rule;

import com.thoughtworks.Target;

public class ContainThreeRule implements Rule {
    @Override
    public String value(Integer number) {
        return Target.FIZZ.get();
    }

    @Override
    public boolean isValid(Integer number) {
        return String.valueOf(number)
            .contains(String.valueOf(Target.FIZZ.number()));
    }
}
