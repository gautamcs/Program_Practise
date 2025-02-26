package com.gautam.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        System.out.println(" Frequency of Each Character of a String ... ");

        String str = "Hello";

        List<String > list = Stream.of(str.split("")).toList();
        System.out.println(list);

        Map<String, Long> collect = Stream.of(str.split("")).map(String::toLowerCase).
                collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
    }
}
