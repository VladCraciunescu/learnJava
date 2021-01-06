package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<String> l1 = List.of("AAA", "BB", "C", "DDDDDD", "E");
        var res1 =
                l1.stream()
                  .collect(Collectors.mapping(s->s.length(),Collectors.summingInt(n->n)));
        System.out.println(res1);

    }
}
