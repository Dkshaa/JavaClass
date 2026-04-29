package Day8;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
    public static void main(String [] args){
        //filter() used to select the element based on condition
        List<Integer> list= Arrays.asList(10,15,20,25,30);
        list.stream().filter(n->n%2==0).forEach(System.out::println);

        //filter names starting with R
        List<String> names=Arrays.asList("Raja","Shiva","Rama");
        names.stream().filter(name->name.startsWith("R")).forEach(System.out::println);

        //map() used to transform/convert each element
//        list<String> st =Arrays.asList("Raja","Shiva","Rama");
//        st.stream().map(String::toUpperCase).forEach(System.out::println);

        //filter and map integration
        List<Integer> al =Arrays.asList(10,15,20,25,30);
        al.stream().filter(n->n%2==0) //filter even
                .map(n->n*2).forEach(System.out::println);
    }
}
