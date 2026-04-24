package com.Assessment;
import java.util.Arrays;
import java.util.List;

public class SecondMax {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 40, 30, 50, 50);

        int secondMax = numbers.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Maximum: " + secondMax);
    }
}