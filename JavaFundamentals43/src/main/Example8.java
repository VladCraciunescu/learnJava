package main;

import java.util.Optional;

public class Example8 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.of(10);
        Optional<Integer> o2 = Optional.empty();
        if(o2.isPresent()){
            Integer i1 = o2.get();
            System.out.println(i1);
        }
    }
}
