package nl.dstibbe.example.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Small example demonstrating basic map operations.
 *
 * Maps are simple data structures that associate a key with an element. This lets the map be very flexible.
 */
public class MapExample{

    public static void main(String[] args){


        //Declaring and initiating a hash map
        //with String keys and Integer values;
        HashMap<String, Integer> counting = new HashMap<>();

        System.out.println("Initial map size: " + counting.size());

        //Adding elements to a hashmap
        counting.put("Apples", 5);
        counting.put("Oranges", 12);
        counting.put("Pears", 4);
        counting.put("Pineapples", 21);

        System.out.println("Map size after adding entries: " + counting.size());


        //Getting an element from a hashmap
        Integer nrOfOranges = counting.get("Oranges");
        System.out.println("Number of oranges: " + nrOfOranges);

        //Testing whether an element is in the hashmap
        boolean hasOranges = counting.containsKey("Oranges");
        boolean hasBananas = counting.containsKey("Bananas");
        System.out.println("Map has oranges: " + hasOranges);
        System.out.println("Map has bananaes: " + hasBananas);


        //updating an element in the hashmap is the same as adding it.
        // this works because keys are unique.
        counting.put("Oranges", 3);
        System.out.println("Number of oranges after update: " + nrOfOranges);

        //Removing an element from the hashmap
        counting.remove("Pears");
        System.out.println("Map size after removing an entry: " + counting.size());


        //Example of getting all keys from the hashmap (and printing them)
        System.out.println("\nPrinting all keys");
        System.out.println("-----------------");
        for(String key: counting.keySet()){
            System.out.println("key: " + key);
        }
        System.out.println("-----------------\n");

        //Example of getting all values from the hashmap (and printing them)
        System.out.println("\nPrinting all values");
        System.out.println("-------------------");
        for(Integer value: counting.values()){
            System.out.println("value: " + value);
        }
        System.out.println("-------------------\n");

        //Example of getting all entries from the hashmap (and printing them)
        System.out.println("\nPrinting all entries");
        System.out.println("--------------------");
        for(Map.Entry<String, Integer> entry: counting.entrySet()){
            System.out.println("entry: " + entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("--------------------\n");

        //Removing all entries from the hashmap
        counting.clear();
        System.out.println("Map size after clearing: " + counting.size());

    }
}