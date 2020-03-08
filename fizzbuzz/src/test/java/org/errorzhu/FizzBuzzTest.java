package org.errorzhu;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void test_say_fizz_divided_by_3(){
        asssertResult(3, "fizz");

    }

    private void asssertResult(int value, String type) {
        FizzBuzz fizzBuzz = new FizzBuzz(value);
        String result = fizzBuzz.say();
        Assert.assertEquals(type, result);
    }

    @Test
    public void test_say_buzz_divided_by_5(){
        asssertResult(5, "buzz");
    }

    @Test
    public void test_say_fizzbuzz_divided_by_5_and_3(){
        asssertResult(15, "fizzbuzz");
    }
}
