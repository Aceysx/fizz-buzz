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

    @Test
    public void should_return_Fizz_when_multiples_of_3() {
        assertEquals("Fizz", FizzBuzz.of(3));
        assertEquals("Fizz", FizzBuzz.of(6));
    }

    @Test
    public void should_return_Buzz_when_multiples_of_5() {
        assertEquals("Buzz", FizzBuzz.of(5));
        assertEquals("Buzz", FizzBuzz.of(10));
    }

    @Test
    public void should_return_Whizz_when_multiples_of_7() {
        assertEquals("Whizz", FizzBuzz.of(7));
        assertEquals("Whizz", FizzBuzz.of(14));
    }


}
