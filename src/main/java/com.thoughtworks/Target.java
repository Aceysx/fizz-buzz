package com.thoughtworks;

public enum Target {
    FIZZ("Fizz", 3),
    BUZZ("Buzz", 5),
    WHIZZ("Whizz", 7);

    private String target;
    private Integer number;

    Target(String target, int number) {
        this.target = target;
        this.number = number;
    }


    public String get() {
        return this.target;
    }

    public Integer number() {
        return this.number;
    }

    public String parse(Integer it) {
        return it % this.number == 0
                ? this.target
                : "";
    }
}
