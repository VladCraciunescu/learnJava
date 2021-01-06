package main;

import java.util.Optional;

public class Example7 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.of(10);
        Optional<Integer> o2 = Optional.empty();
        Optional<Integer> o3 = Optional.ofNullable(10);
        Optional<Integer> o4 = Optional.ofNullable(m1());
        System.out.println(o1.isPresent());
        System.out.println(o2.isPresent());
    }
    static Integer m1(){
        return null;
    }
}
