package com.Assessment;
import java.util.Arrays;
import java.util.List;

public class StringConcat {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Stream", "API");

        String result = names.stream()
                .reduce("", (a, b) -> a + " " + b);

        System.out.println("Concatenated String:" + result);
    }
}