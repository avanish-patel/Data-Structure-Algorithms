package mix;

import java.util.HashMap;

public class MF {

    // Most frequently occurred element found in O(0)

    public static void main(String[] args){

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};


        int max = mostFrequent(array1);

        System.out.println(max);

    }

    public static Integer mostFrequent(int[] array) {

        Integer maxCount=-1, maxItem = null;

        HashMap<Integer,Integer> container = new HashMap<Integer, Integer>();

        for(int i : array){

            if (container.containsKey(i)){

                Integer newValue = container.get(i)+1;

                container.put(i, newValue);
            }else{

                container.put(i, 1);
            }

            if(container.get(i) > maxCount){

                maxCount = container.get(i);

                maxItem = i;
            }

        }


        return maxItem;
    }


}

