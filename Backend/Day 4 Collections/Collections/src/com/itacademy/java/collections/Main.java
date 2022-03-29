package com.itacademy.java.collections;

public class Main {

    public static void main(String[] args) {
        String[] stringArray = {"Subaru", "Bmw", "Suzuki"};
        System.out.println(stringArray[1]);

        stringArray[2] = "Honda";

        System.out.println(stringArray.length);

        for(String car:stringArray){
            System.out.println(car);
        }

        int[] intArray = {-40,55,63,17,22,68,89,97,89};

        for(int element:intArray){
            System.out.print(element + " ");
        }


    }
}
