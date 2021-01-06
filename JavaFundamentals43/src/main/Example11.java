package main;

import java.util.Optional;

public class Example11 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);
        o2.ifPresent(x -> {
            System.out.println(x);
        });

        o2.ifPresentOrElse(x -> {

        }, () -> {

        });
    }

}

