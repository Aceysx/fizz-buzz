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

    @Test
    public void should_return_FizzBuzz_when_multiples_of_3_and_5() {
        assertEquals("FizzBuzz", FizzBuzz.of(60));
        assertEquals("FizzBuzz", FizzBuzz.of(120));
    }

    @Test
    public void should_return_FizzWhizz_when_multiples_of_3_and_7() {
        assertEquals("FizzWhizz", FizzBuzz.of(21));
        assertEquals("FizzWhizz", FizzBuzz.of(42));
    }

    @Test
    public void should_return_BuzzWhizz_when_multiples_of_5_and_7() {
        assertEquals("BuzzWhizz", FizzBuzz.of(140));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_multiples_of_3_and_5_and_7() {
        assertEquals("FizzBuzzWhizz", FizzBuzz.of(210));
    }

    @Test
    public void should_return_Fizz_when_contains_3_and_not_contains_5() {
        assertEquals("Fizz", FizzBuzz.of(13));
        assertEquals("Fizz", FizzBuzz.of(30));
    }

    @Test
    public void should_return_Buzz_when_contains_5_and_not_contains_7_and_multiples_of_3_and_5() {
        assertEquals("Buzz", FizzBuzz.of(15));
        assertEquals("Buzz", FizzBuzz.of(45));
    }

    @Test
    public void should_return_BuzzWhizz_when_contains_5_and_not_contains_7_and_multiples_of_3_and_5and_7() {
        assertEquals("BuzzWhizz", FizzBuzz.of(105));
    }

    @Test
    public void should_return_Fizz_when_contains_7_and_contains_3() {
        assertEquals("Fizz", FizzBuzz.of(73));
    }

}
