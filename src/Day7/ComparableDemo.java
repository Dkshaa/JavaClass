package Day7;

import org.w3c.dom.ls.LSOutput;

public class ComparableDemo {
    public static void main(String [] args){
        System.out.println("A".compareTo("Z")); //-25
        System.out.println("Z".compareTo("A")); //25
        System.out.println("A".compareTo("A")); //0


    }

}
