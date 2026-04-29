package Day8;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "Diksha");
        hs.put(2, "Ganesh");
        hs.put(3, "Ram");
        hs.put(4, "Siksha");

        hs.put(5, "lilly");
        System.out.println(hs);

        //for only keys
        Set<Integer> k = hs.keySet();
        for (Integer i : k) {
            System.out.print(i + " ");
        }
        System.out.println();
        //for only values
        Collection<String> values = hs.values();

        for (String s : values) {
            System.out.println(s + " ");
        }
        //for getting key value pairs
        for(Map.Entry<Integer,String> ml: hs.entrySet()) {
            System.out.println(ml);
        }
    }
}
