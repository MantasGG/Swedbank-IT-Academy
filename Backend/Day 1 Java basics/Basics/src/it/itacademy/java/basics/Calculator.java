package it.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        String repeat;

        String figure = scanner.nextLine();
        switch(figure) {
            case "Triangle":
                a = Integer.valueOf(scanner.nextLine());
                b = Integer.valueOf(scanner.nextLine());
                c = Integer.valueOf(scanner.nextLine());
                System.out.println(figure + " perimeter is " + (a+b+c) + " and area is " + (a*b) + ".");
                System.out.println("Continue? y/n");
                repeat = scanner.nextLine();
                if(repeat == "y" ) main(null);
                break;
            case "Rectangle":
                a = Integer.valueOf(scanner.nextLine());
                b = Integer.valueOf(scanner.nextLine());
                System.out.println(figure + " perimeter is " + ((a+b)*2) + " and area is " + (a*b) + ".");
                System.out.println("Continue? y/n");
                repeat = scanner.nextLine();
                if(repeat == "y" ) main(null);
                break;
            case "Square":
                a = Integer.valueOf(scanner.nextLine());
                System.out.println(figure + " perimeter is " + (a*4) + " and area is " + (a*a) + ".");
                System.out.println("Continue? y/n");
                repeat = scanner.nextLine();
                if(repeat == "y" ) main(null);
                break;
            default:
                System.out.println("ERROR! Wrong input. Try again.");
                main(null);
                break;
        }
    }
}
