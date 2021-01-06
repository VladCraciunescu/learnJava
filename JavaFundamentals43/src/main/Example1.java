package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> l1 = List.of("AAA", "BB", "C", "DDDDDD", "E");
        var res1=
                l1.stream()
                  .mapToInt(s->s.length())
                  .sum();
        System.out.println(res1);
        var res2=
                l1.stream()
                  .collect(Collectors.summingInt(s->s.length()));
        System.out.println(res2);
    }
}
