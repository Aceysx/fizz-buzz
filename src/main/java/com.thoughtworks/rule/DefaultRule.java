package com.thoughtworks.rule;

import com.thoughtworks.Target;

public class DefaultRule implements Rule {
    @Override
    public String value(Integer number) {
        return Target.FIZZ.parse(number)
            +
            Target.BUZZ.parse(number)
            +
            Target.WHIZZ.parse(number);
    }

    @Override
    public boolean isValid(Integer number) {
        return true;
    }
}
