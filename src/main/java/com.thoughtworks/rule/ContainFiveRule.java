package com.thoughtworks.rule;

import com.thoughtworks.Target;

public class ContainFiveRule implements Rule {
    @Override
    public String value(Integer number) {
        return Target.BUZZ.parse(number) + Target.WHIZZ.parse(number);
    }

    @Override
    public boolean isValid(Integer number) {
        String numberStr = String.valueOf(number);
        return numberStr.contains(String.valueOf(Target.BUZZ.number()))
            && !numberStr.contains(String.valueOf(Target.WHIZZ.number()));
    }
}
