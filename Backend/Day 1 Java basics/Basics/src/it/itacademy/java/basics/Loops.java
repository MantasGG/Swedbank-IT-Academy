package it.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int days = Integer.valueOf(scanner.nextLine());
        //int hours = 0;
        //int minutes = 0;
/*
        for(int i=0;i<days;i++){
            hours += 24;
            for(int j=0;j<24;j++){
                minutes += 60;
            }
        }
        */

        // task 8
        /*
        int temp = 0;
        while(temp<days){
            hours += 24;
            minutes += 1440;
            temp++;
        }*/

        //System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");

        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        for(int i=1;i<=number;i++){
            factorial = factorial * i;
        }

        System.out.println("Factorial number of " + number + " is " + factorial);
    }
}
