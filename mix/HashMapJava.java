package mix;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {

    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        // adding key and value pairs to hashmap
        hmap.put(101, "Avanish");
        hmap.put(102, "Dixit");
        hmap.put(103, "Raj");

        // print the key and values of hashmap
        for (Map.Entry m : hmap.entrySet()) {

            System.out.println(m.getKey() + " : " + m.getValue());
        }

        // removing key 102
        hmap.remove(102);

        // get return the value at specific key
        System.out.println(hmap.get(101));

        System.out.println(hmap);
    }

}
