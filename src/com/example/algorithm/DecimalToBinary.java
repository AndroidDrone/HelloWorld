package com.example.algorithm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this class helps to convert decimal number to
 * binary number
 */

public class DecimalToBinary {

    public static void main(String[] args) {

        int n;
        String val = "";
        List<String[]> list = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        n = s.nextInt();
        while (n > 0) {
            int a = n % 2;
            val = a + val;
            n = n / 2;

          /* val = Integer.toBinaryString(n);  // other option to convert binary to decimal
           break;*/
            //list.add(val);
        }
        System.out.println("Binary number of Given Decimal number is : " + val);

        //System.out.println("number of Given Decimal : " + countSetBits(Integer.parseInt(val)));

        System.out.println("Count number of 1's and 0's in list : " +countSet(Integer.parseInt(val)));
    }

    /**
     * count number of occurence of 1's and 0's in binary number
     * @param number
     * @return
     */
    private static int countSet(int number) {
        int contNumber = 0;
        int numberOfOnes = 0;

        while (number > 0) {
            int remainder = number %2;

            if(remainder == 1) {
                contNumber ++;

                if(contNumber > numberOfOnes)
                    numberOfOnes = contNumber;


            } else { //reset the contNumber
                contNumber = 0;
            }
            number = number/2;
        }

        //System.out.println("Consecutive 1's in number : "+numberOfOnes);
        return numberOfOnes;
    }
}


