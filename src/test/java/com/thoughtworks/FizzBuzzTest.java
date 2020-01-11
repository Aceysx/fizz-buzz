package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_number_when_not_multiples_of_3_or_5_or_7() {
        assertEquals("1", FizzBuzz.of(1));
        assertEquals("2", FizzBuzz.of(2));
        assertEquals("4", FizzBuzz.of(4));
    }

}
