package main;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<String> l1 = List.of("AAA", "BB", "C", "DDDDDD", "E");
        IntSummaryStatistics res1=
                l1.stream()
                  .mapToInt(s->s.length())
                  .summaryStatistics();
        System.out.println(res1);
    }
}
