package Day7;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String [] args){
        ArrayList <Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(100);
        al.add(150);
        al.add(100);
        al.add(1);
        System.out.print(al);
        System.out.println();

        for(Integer integer:al){
            System.out.println(integer);
        }
    }
}
