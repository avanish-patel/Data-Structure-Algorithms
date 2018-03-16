package searching;

public class BinarySearch {

    // run on O(log n) -> the array need to be sorted before search

    public static int binarySearch(int[] array, int key) {

        int low = 0;
        int high = array.length -1;

        while (low <= high) {

            int mid = (low + high)/2;

            if (key < array[mid]) {

                high = mid-1;

            } else if (key > array[mid]) {

                low = mid +1;

            }else {

                return mid;
            }
        }


        return -1;
    }

    public static void main(String[] args) {

        int[] array = {2, 4, 7, 8, 12, 24, 35, 46, 58, 60, 63, 69, 78, 79};

        int index = binarySearch(array, 4);

        if (index != -1) {

            System.out.println("Key found at index :" + index);
        }else {

            System.out.println("Key did't found, Please try another key..");
        }

    }
}
