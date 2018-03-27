package com.example.algorithm;


/**
 *  rearrange array with first even and then odd number
 */
public class rearrangeEvenAndOdd {

    public static void main (String[] args) {

        int arr[] = { 2,1,3,24,12,45, 10, 9, 10, 45 };
        int n = arr.length;

        // variables
        int j = -1, temp;


        // quick sort method
        
        for (int i=0 ; i< n ; i++) {
            if (arr[i] % 2 == 0) {

                j++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        // show list of rearranged numbers
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }

    }
}
