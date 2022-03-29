package it.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        int volume = input * input * input;
        int perimeter = input * 12;

        System.out.println("Cube's volume: " + volume + "cm3.");
        System.out.println("Cube's perimeter: " + perimeter + "cm.");

        double feet = Double.valueOf(scanner.nextLine());
        int inches = Integer.valueOf(scanner.nextLine());

        task4(feet,inches);
    }

    public static void task4(double feet, double inches){
        double toInches = ((feet * 12) + inches) * 2.54;

        System.out.println(feet + " feet and " + inches + " = " + toInches + " cm");

    }
}
