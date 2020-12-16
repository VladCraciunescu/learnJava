package example1;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Consumers {
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println(s);
        BiConsumer<String, Integer> c2 = (x, y) -> {
            if (y == x.length()) {
                System.out.println(x);
            }
        };
        c2.accept("hello",5);


        Random r = new Random();
        Supplier<Integer> s1 = ()-> r.nextInt(1000);
        int x = s1.get();
        System.out.println(x);


        Function<String,Integer> f1 = s -> s.length();
        int y =f1.apply("hello");
        System.out.println(y);
    }
}
