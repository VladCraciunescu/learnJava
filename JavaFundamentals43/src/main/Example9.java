package main;

import java.util.Optional;
import java.util.function.Supplier;

public class Example9 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.of(10);
        Optional<Integer> o2 = Optional.empty();
        int i1 = o1.orElse(-1);
        int i2 = o2.orElse(-1);
        Supplier<Integer> s1 = ()->-1;
        Integer i3 = o1.orElseGet(s1);

        Integer i4 = o2.orElseThrow(() -> new RuntimeException());

        Integer i5 = o1.or(() -> o2).orElse(-1);

        o1.ifPresentOrElse(x -> {
            System.out.println(x);
        }, () -> {
            System.out.println("There's no value!");
        });
    }
}
