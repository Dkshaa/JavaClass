package Day8;

import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<List<Integer>>list=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),
                Arrays.asList(5,6));
//list.stream().map(x->x.stream()).forEach(System.out::println);
        list.stream().flatMap(x->x.stream())
                .forEach(System.out::println);


        List<String>words=Arrays.asList("Java","Code");
        words.stream().flatMap(word->Arrays.stream(word.split(""))).forEach(System.out::println);

        //reduce is used to combine all elements in a single result
        List<Integer>list1=Arrays.asList(1,2,3,4,5);
        int sum=list1.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }

}
