package mix;

// find the occupancies of different elements of array

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumber {

    private static void printFreq(int[] arr) {

        // create an empty hashmap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        // traverse through given array
        for (int i=0; i < arr.length ; i++) {

            // store the value of
            Integer a = hmap.get(arr[i]);

            // if first occurunce of element
            if (hmap.get(arr[i]) == null) {

                hmap.put(arr[i], 1);

                // if element is already exist in hashmap
            } else {

                hmap.put(arr[i], ++a);
            }

        }

        System.out.println(hmap);
        // print the result

        for (Map.Entry m : hmap.entrySet()) {

            System.out.println("Frequency of :"+ m.getKey()+" is "+ m.getValue());
        }


    }


    public static void main(String[] args) {

        int[] array = {12, 45, 3, 12, 34, 12, 45};

        printFreq(array);


    }
}
