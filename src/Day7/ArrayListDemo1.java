package Day7;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
    public static void main(String [] args){
        ArrayList <Integer> al =new ArrayList<>();
        al.add(19);
        al.add(7);
        al.add(1);
        System.out.println(al);

        //sorts the array
        Collections.sort(al);
        System.out.println(al);
    }
}
