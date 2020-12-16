package example1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String,Integer> f1 = s -> s.length();
        int y =f1.apply("hello");
        System.out.println(y);

        BiFunction<String,Integer, Boolean> bf1 = (a,b) -> b==a.length();
        boolean b1 =bf1.apply("hello",5);
        System.out.println(b1);

    }
}
