package main;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {

        List<String> l1 = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");
        TreeMap<String, Integer> tm1 = l1.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length(),
                        (a, b) -> a + b,
                        () -> new TreeMap<>()

                        )
                );
        System.out.println(tm1);
    }
}
