package com.example.algorithm;

import java.util.Scanner;

public class Pallindrome {

    public static void main (String[] args) {
        String original, reverse = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter String to check Pallindrome : \n");

        original = scanner.nextLine();
        
        int length = original.length();

        for (int i = length - 1 ; i >= 0; i--) {

            reverse = reverse + original.charAt(i);

        }

        if (original.equals(reverse)) {
            System.out.println("String is Pallindrome");
        } else  {
            System.out.println("String is not Pallindrome");
        }

    }
}
