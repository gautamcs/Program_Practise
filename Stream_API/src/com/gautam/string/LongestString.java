package com.gautam.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {
        System.out.println(" Longest String ... ");
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> max = strings.stream().max(Comparator.comparingInt(String::length));

        if (max.isPresent()) {
            System.out.println(max.get()+" : "+max.get().length());
        } else {
            System.out.println(" Not Found!!");
        }

    }
}
