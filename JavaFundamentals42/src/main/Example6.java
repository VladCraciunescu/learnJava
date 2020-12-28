package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<String> l1 = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");

        List<Integer> res= l1.stream()
                                .collect(
                                        Collectors.mapping(
                                                s -> s.length(),
                                                Collectors.toList()
                                        )
                                );
        System.out.println(res);
    }
}
