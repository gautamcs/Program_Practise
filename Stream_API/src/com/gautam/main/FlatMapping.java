package com.gautam.main;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapping {
    public static void main(String[] args) {

        Stream<String> strings = Stream.of("1,2,3","4,5");

        Stream<Integer> integerStream = strings.flatMap(s -> Arrays.stream(s.split(","))).map(Integer::parseInt);

        integerStream.forEach(System.out::println);
    }
}
