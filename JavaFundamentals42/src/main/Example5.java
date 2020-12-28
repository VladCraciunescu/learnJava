package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> l1 = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");
        var res = l1.stream()
                                  .collect(
                                          Collectors.teeing(
                                                  Collectors.counting(),
                                                  Collectors.joining(),
                                                  (a,b)->List.of(a,b)
                                          )
                                  );
        System.out.println(res);
    }
}
