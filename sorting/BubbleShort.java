package sorting;

import java.util.Arrays;

public class BubbleShort {

    // Time complexity : O(n^2)

    private static int[] bubbleShort(int[] array){

        int i,j;

        for (i =0; i<array.length-1;i++) {

            for (j= 0;j< array.length-i-1;j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }


        return array;
    }


    public static void main(String[] args) {


        int[] numbers = {45,3,12,62,27,44};

        int[] result = bubbleShort(numbers);

        System.out.println(Arrays.toString(result));
    }

}
