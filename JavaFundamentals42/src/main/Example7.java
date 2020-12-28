package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<String> l1 = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");
        List<Integer> res1= l1.stream()
                              .collect(Collectors.mapping(s -> s.length(),
                                      Collectors.filtering(
                                           n->n%2==0, Collectors.toList()
                                   )
                              ));
        System.out.println(res1);
    }
}
