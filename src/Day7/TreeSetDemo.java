package Day7;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String [] args){
        TreeSet<Integer> t= new TreeSet<>();
        //aranges in ascending order
        t.add(10);
        t.add(1);
        t.add(5);
        System.out.println(t);
        System.out.println(t.getFirst());
        System.out.println(t.getLast());
        System.out.println(t.pollFirst());
    }
}
