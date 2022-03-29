package it.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        int x = 0;

        for(int i=0;i<input;i++){
            for(int j=0;j<x;j++){
                System.out.print("#");
            }
            System.out.println("#");
            x+=2;
        }
    }
}
