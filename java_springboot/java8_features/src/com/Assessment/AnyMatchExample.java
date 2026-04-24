package com.Assessment;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 150, 40);

        boolean result = numbers.stream()
                .anyMatch(n -> n > 100);

        System.out.println("Any number >100 : " + result);
    }
}