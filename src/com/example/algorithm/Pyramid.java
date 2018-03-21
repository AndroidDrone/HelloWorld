package com.example.algorithm;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Layer For Pyramid : ");

        number  = scanner.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
