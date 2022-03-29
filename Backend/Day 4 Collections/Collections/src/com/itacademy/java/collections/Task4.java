package com.itacademy.java.collections;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer,String> vardai = new HashMap<>();

        vardai.put(1,"Simas");
        vardai.put(2,"Tomas");
        vardai.put(3,"Eliza");

        System.out.println(vardai);

        // tikrina ar yra reikšmė
        if(vardai.containsKey(3)){
            vardai.put(3,"Joana");
        }

        System.out.println(" ");
        System.out.println(vardai);

        for (Map.Entry<Integer,String> vardas:vardai.entrySet()) {
            System.out.println(vardas.getKey() + " " + vardas.getValue());
        }
    }
}
