package Day7;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add("dishwash");
        al.add(100);
        System.out.println(al);

        for (int i = 0; i < al.size(); ++i) {
            Object obj = al.get(i);
            System.out.print(obj + " ");
        }
        System.out.println("");
        for (Object object : al) {
            System.out.println(object + " ");
        }
        System.out.println("");
        Iterator it = al.iterator();
        while (it.hasNext()) {
            Object object = it.next();
            System.out.println(object);
        }
    }
}
