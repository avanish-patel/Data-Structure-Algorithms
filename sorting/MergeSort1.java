package sorting;

public class MergeSort1 {

    // Merge sort work on divide and conquer using recursion

    // Time complexity : O(n log(N))   Space complexity : O(n)



    public static void main(String[] args) {

        int[] arr = {23,4,46,2,5,52,35,25};

        System.out.println("Before Sorting");

        printArray(arr);

        System.out.println("After Sorting");

        sort(arr,0,arr.length-1);

        printArray(arr);
    }

    // Method to print the array
    private static void printArray(int[] arr) {

        for (int i=0; i< arr.length; i++) {

            System.out.print(arr[i]+"  ");
        }

        System.out.println();
    }

    // divide the array of [l....r] into single elements using recursion
    private static void sort(int arr[], int l, int r){

        // condition to get out of recursion
        if (l < r) {

            // find mid of array
            int m = (l+r)/2;

            // sort two half's of arrays
            sort(arr, l, m);
            sort(arr, m+1, r);
            // merge them together
            merge(arr, l, m, r);
        }

    }

    // Method to merge to arrays together
    private static void merge(int[] arr, int l, int m, int r) {

        // find the sizes of two arrays to be merged
        int n1 = m - l +1;
        int n2 = r - m;

        // create two sub arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        //copy data to this two sub-arrays
        for (int i=0; i<n1; i++) {

            L[i] = arr[l+i];
        }
        for (int j=0; j<n2; j++) {

            R[j] = arr[m + 1 + j];
        }

        // Merge two arrays

        // initialize indexes of two arrays

        int i =0 , j=0;

        int k = l;

        while (i < n1 && j < n2) {

            if (L[i] < R[j]) {

                arr[k] = L[i];
                i++;

            }else {

                arr[k] = R[j];
                j++;
            }

            k++;
        }

        // copying the remaining elements of L[]

        while (i < n1) {

            arr[k] = L[i];
            i++;
            k++;
        }

        // copying the remaining elements of R[]

        while (j < n2) {

            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
