package com.itacademy.java.collections;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple");

        for (String fruitName:fruits) {
            System.out.print(fruitName + " ");
        }
        System.out.println(" ");

        System.out.println(fruits.size());

        Set<String> uniqueFruitNames = new HashSet<>(fruits);

        for (String fruitName:uniqueFruitNames) {
            System.out.print(fruitName + " ");
        }

        System.out.println(" ");

        System.out.println(uniqueFruitNames.size());

        Set<String> uniqueFruitNamesTree = new TreeSet<>(fruits);

        for (String fruitName:uniqueFruitNamesTree) {
            System.out.print(fruitName + " ");
        }

        System.out.println(" ");
        System.out.println(uniqueFruitNamesTree.size());

        /*List<String> carNames = Arrays.asList("Subaru","Bmw","Suzuki","Subaru");

        Set<String> uniqueCarName = new HashSet<>(carNames);
        uniqueCarName.addAll(carNames); // same

        for (String carName:uniqueCarName) {
            System.out.print(carName + " ");
        }

        Set<String> uniqueCarNamesTree = new TreeSet<>(uniqueCarName);
        System.out.println(" ");
        for (String carName:uniqueCarNamesTree) {
            System.out.print(carName + " ");
        }*/
    }
}
