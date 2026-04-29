package Day8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateEvenOdd {
public static void main(String[] args){
    Predicate<Integer> p=(e)->e%2==0;
    System.out.println(p.test(12));
    System.out.println(p.test(5));
    System.out.println(p.test(2));

    Function<String,Integer> f=(e)->e.length();
    System.out.println(f.apply("Hello World"));

    Function<String,String> f1=(e1)->e1.toUpperCase();
    System.out.println(f1.apply("diksha karki"));

    Consumer <String> con =name-> System.out.println("Welcome "+name);
    con.accept("Diksha");

    List<String> list = Arrays.asList("dik","sik");
    Consumer<String> c =n-> System.out.println(n);
    list.forEach(c);
    //Alternative for each
    list.forEach(k-> System.out.println(k));

    Supplier<String> s12=()->"its ok";
    System.out.println(s12.get());
}
}
