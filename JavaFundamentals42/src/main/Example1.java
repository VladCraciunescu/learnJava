package main;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String>  l1 = List.of("AAA","B","CCCCC","DDD", "FFFFFF");
        List<String> res1 = l1.stream()
                            .collect(Collectors.toList());
        Set<String> res2 = l1.stream()
                           .collect(Collectors.toSet());
        TreeSet<String> res3 = l1.stream()
                               .collect(Collectors.toCollection(TreeSet::new));
    }
}
