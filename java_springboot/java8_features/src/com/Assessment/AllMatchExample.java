package com.Assessment;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(120, 150, 200);

        boolean result = numbers.stream()
                .allMatch(n -> n > 100);

        System.out.println("All numbers >100 : " + result);
    }
}