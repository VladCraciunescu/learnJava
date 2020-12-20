package example4;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<List<Integer>> l1 = List.of(
                List.of(1,2,3,4,5),
                List.of(4,5,6),
                List.of(1,3)
        );
        var s =l1.stream()
          .flatMap(q->q.stream())
          .reduce(0, (a,b) -> a + b);
        System.out.println(s);
    }
}
