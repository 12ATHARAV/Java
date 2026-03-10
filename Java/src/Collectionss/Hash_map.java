package Collectionss;

// put()
// get()
// remove()
// containsKey()
// containsValue()
// keySet()
// values()
// size()
// clear()

import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Atharav");
        map.put(2, "Sanjana");
        map.put(3, "Savji");

        System.out.println("Map: " + map);

        System.out.println("Value of key 2: " + map.get(2));

        map.remove(3);
        System.out.println("After removal: " + map);

        System.out.println("Contains key 1? " + map.containsKey(1));

        System.out.println("Contains key Sanjana? " + map.containsValue("Sanjana"));

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());

        System.out.println("Size: " + map.size());

        map.clear();
        System.out.println("After clear: " + map);
    }
}
