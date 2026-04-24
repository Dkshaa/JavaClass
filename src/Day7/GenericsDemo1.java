package Day7;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String [] args){
        ArrayList<String> str =new ArrayList<String>();
        str.add("Diksha");
        str.add("keeran");
        System.out.println(str);

        for(String st:str){
            System.out.println(st+" ");
        }
    }
}
