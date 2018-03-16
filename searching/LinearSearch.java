package searching;

public class LinearSearch {

    // run on O(n)

    public static int linearSearch(int[] array, int key) {

        for (int i=0; i< array.length; i++) {

            if (key == array[i]) {

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {


        int[] array = {34, 64, 324, 84, 489, 34, 53, 35};

        int index = linearSearch(array, 53);

        if (index != -1) {

            System.out.println("Key found at index :"+ index);
        }else {
            System.out.println("Key did not found. Try another key");

        }

    }
}
