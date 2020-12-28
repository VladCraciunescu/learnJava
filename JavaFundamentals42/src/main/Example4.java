package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<String> l1 = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");
        String res1= l1.stream().collect(Collectors.joining());
        System.out.println(res1);
        String res2= l1.stream().collect(Collectors.joining(","));
        System.out.println(res2);
        String res3= l1.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(res3);
    }
}
