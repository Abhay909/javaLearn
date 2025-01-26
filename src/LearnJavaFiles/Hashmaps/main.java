package LearnJavaFiles.Hashmaps;

import java.util.HashMap;

public class main {

    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient


        HashMap<String, Double> map = new HashMap<>();

        // Add an element
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("Coconut", 1.00);

        // Remove an element
        map.remove("Coconut");

        // Get the item
        // System.out.println(map.get("apple")); // 0.5

        // check is something contains something

        /*
        System.out.println(map.containsKey("banana")); // true

        if (map.containsKey("apple")) {
            System.out.println(map.get("apple")); // 0.5
        } else {
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(1.00));

        */

        // Return size
        // System.out.println(map.size());

        // Fix ugly formatting

        // For every key in our set of keys (all keys) do this ...
        for(String key : map.keySet()) {
            // Gets the value of the key.
            System.out.println(key + " : $" + map.get(key));
        }




    }

}
