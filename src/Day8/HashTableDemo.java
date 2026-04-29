package Day8;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String [] args){
       //initial capacity of hasTable is 11
        Hashtable<Integer ,String> ht =new Hashtable<>();
        ht.put(1,"Ram");
        ht.put(2,"Ramayana");
        //Throws error
//            ht.put(null,"Ramayana");
        System.out.println(ht);
        for(Integer i: ht.keySet()){
            System.out.println(i);
        }
    }
}
