package com.Assessment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class sortList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 30, 25);

        List<Integer> sortedList = numbers.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending Order: " + sortedList);
    }
}