package sorting;

public class QuickSort {

    // Method to print the Array
    private static void printArray(int[] array){

        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    // method to sort array recursively
    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // pi is the partitioning index, arr[pi] at right place
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);

        }
    }

    // method to partition array and and fix the pivot to correct index
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j=low; j< high; j++) {

            if (arr[j] <= pivot) {

                i++;

                // swap arr[i] and arr[j]

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap the  arr[i+1] with pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;


        return i+1;
    }
    // Main method
    public static void main(String[] args) {

        int[] array = {234, 653, 24, 653, 245, 45, 325, 634, 234};

        System.out.println("Before sorting");
        printArray(array);

        quickSort(array,0,array.length-1);

        System.out.println("After sorting");
        printArray(array);
    }

}
