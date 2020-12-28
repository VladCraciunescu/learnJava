package main;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<String> l1 = List.of("AAA","B","CCCCC","DDD", "FFFFFF","AAA");
        Map<String,Integer> m1 = l1.stream()
                                   .collect(
                                           Collectors.toMap(
                                                   s->s,
                                                   s->s.length(),
                                                   (a,b)->a + b
                                           )
                                   );
        System.out.println(m1);
    }
}
