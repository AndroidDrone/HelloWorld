package com.example.algorithm;


import java.util.HashMap;
import java.util.Map;

/**
 * this class counts number of occurance of
 * element in array using hashMap // where hashmap stores value in the form of key and value but does not maintain
 * order but if we use Tree Map it stores value in the form of sorted array
 */
public class FrequencyString {

    // This function prints frequencies of all elements
    static void printFreq(int arr[])
    {
        // Creates an empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            Integer c = hmap.get(arr[i]);

            // If this is first occurrence of element
            if (hmap.get(arr[i]) == null)
                hmap.put(arr[i], 1);

                // If elements already exists in hash map
            else
                hmap.put(arr[i], ++c);
        }

        // Print result
        for (Map.Entry m:hmap.entrySet())
            System.out.println("Given array has occurance of " + m.getKey() + " is " + m.getValue());
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        printFreq(arr);
    }
}
