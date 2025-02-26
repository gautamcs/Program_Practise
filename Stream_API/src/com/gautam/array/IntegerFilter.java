package com.gautam.array;

import java.util.Arrays;
import java.util.List;

public class IntegerFilter {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        System.out.println(" Array Data: "+myList);

        myList.stream().map(i -> i+"").filter(s -> s.startsWith("1")).
                forEach(System.out::println);
    }
}
