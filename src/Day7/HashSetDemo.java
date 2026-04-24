package Day7;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String [] args){
        HashSet<Integer> hs =new HashSet<>(5); //5 is the size of hashset
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs);
    }
}
