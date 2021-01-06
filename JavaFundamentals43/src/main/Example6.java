package main;

import java.util.Optional;

public class Example6 {
    public static void main(String[] args) {
        String s1 = null;
        Optional<String> s2 = m1();
        System.out.println(s1.length());//nullPointerException

    }
    public static Optional<String> m1(){
        return Optional.empty();
    }
}
