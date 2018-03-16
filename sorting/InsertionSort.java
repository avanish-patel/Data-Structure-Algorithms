package sorting;

import java.util.Arrays;

public class InsertionSort {

    private static int[] insertionSort(int[] list){


        // Time complexity : O(n^2)


        int i,j,key;

        for (i=1;i<list.length;i++) {

            key = list[i];
            j = i -1;

            while (j >= 0 && key < list[j]) {

                int temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;

                j--;
            }
        }

        return list;
    }
    public static void main(String[] args) {


        int[] numbers = {42, 2, 12, 53, 23, 5, 39, 25};

        int[] sorted = insertionSort(numbers);

        System.out.println(Arrays.toString(sorted));
    }
}
