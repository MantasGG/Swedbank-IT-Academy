package com.itacademy.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C");

        Optional<String> a = list.stream().findAny();
        Optional<String> b = list.stream().findFirst();

        System.out.println(a.get());
    }
}
