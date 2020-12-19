package example2;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        Stream<Integer> s1 =Stream.empty();
        Stream<Integer> s2 = Stream.of(3,5,6,7,8,9);
        Supplier<Integer> sup = () -> new Random().nextInt();
        Stream<Integer> s3 = Stream.generate(sup);
        Stream s4 = Stream.iterate(1, i-> i+1);
        s4.limit(10)
           .forEach(System.out::println);
        Stream s5 = Stream.iterate(1 ,
                i->i<=10,
                i->i+1);
        s5.forEach(System.out::println);
    }
}
