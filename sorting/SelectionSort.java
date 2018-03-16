package sorting;

import java.util.Arrays;

public class SelectionSort {

    private static int[] selectionSort(int[] list) {

        // Time complexity : O(n^2)


        int i,j,minValue,minIndex;

        for (i=0; i<list.length;i++) {

            minIndex = i;
            minValue = list[i];

            for(j =i; j< list.length;j++) {

                if( list[j] < minValue){

                    minIndex = j;
                    minValue = list[j];
                }
            }

            if(list[i] > minValue){

                int temp = list[i];
                list[i] = minValue;
                list[minIndex] = temp;
            }
        }

        return list;
    }


    public static void main(String[] args) {

        int[] numbers = {23,12,53,132,14,63,24};

        int[] result = selectionSort(numbers);

        System.out.println(Arrays.toString(result));
    }

}
