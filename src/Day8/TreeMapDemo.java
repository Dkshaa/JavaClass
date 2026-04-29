package Day8;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String [] args){
        TreeMap<Integer,String> tr = new TreeMap<>();
        tr.put(3,"Ram");
        tr.put(4,"Shiva");
        tr.put(50,"Ganes");
        tr.put(6,"Lord");
        tr.put(1,"Diksha");
        System.out.println(tr);

        System.out.println(tr.get(2));
        System.out.println(tr.firstKey());
        System.out.println(tr.lastKey());
        System.out.println(tr.firstEntry());
    }
}
