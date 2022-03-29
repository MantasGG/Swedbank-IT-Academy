package it.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a == b && b == c){
            System.out.println("Triangle is Equilateral. Sides: " + a + " " + " " + b + " " + c);
        }
        else if(a == b || b == c || c == a){
            System.out.println("Triangle is Isosceles. Sides: " + a + " " + b + " " + c);
        }
        else{
            System.out.println("Triangle is invalid. Sides: " + a + " " + " " + b + " " + c);
        }*/

        double distance = scanner.nextDouble();
        double tank = scanner.nextDouble();
        double usage = scanner.nextDouble();
        double fuelPrice = scanner.nextDouble();

        task6(distance,tank,usage,fuelPrice);
    }

    public static void task6(double distance, double tank, double usage, double fuelPrice){

        if(distance/100*usage<=tank){
            System.out.println("Destination is in " + distance + "km. Car able to reach the destination. It will have " + (tank-distance/100*usage) + " liters of fuel left.");
        }
        else {
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. It needs " + (distance/100*usage-tank) + " liter of fuel more. It will cost " + fuelPrice + ".");
        }
    }
}
