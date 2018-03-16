package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    // Time complexity : O(n log(N))   Space complexity : O(n)
    private static void mergeSort(int[] a, int low, int high) {

        int N = high - low;

        if (N <= 1)
            return;

        int mid = low + N/2;

        // recursively sort

        mergeSort(a, low, mid);
        mergeSort(a, mid,high);


        // merge two sorted arrays into temp array

        int[] temp = new int[N];

        int i = low, j = mid, k;

        for (k =0; k< N; k++) {

            if (i == mid) {

                temp[k] = a[j++];

            } else if (j == high){

                temp[k] = a[i++];

            } else if (a[i]<a[j]) {

                temp[k] = a[i++];

            }else{

                temp[k] = a[j++];
            }
        }

        for (k=0; k<N; k++) {

            a[low + k] = temp[k];
        }


    }


    // main method
    public static void main(String[] args) {

        int i,n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Merge-Sort");

        System.out.println("Enter the number of element you wants to sort: ");

        n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the "+n+" element to sort :");

        for (i=0; i< n; i++) {

            array[i] = scanner.nextInt();
        }

        mergeSort(array,0,n);

        System.out.println("Sorted array is :");

        System.out.println(Arrays.toString(array));
    }
}
