package example3;

import java.util.List;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3,4,5);
        boolean b1 =l1.stream().anyMatch(x->x%2==0);
        boolean b2 =l1.stream().allMatch(x->x%2==0);
        boolean b3 =l1.stream().noneMatch(x->x%2==0);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        Stream<Integer> s1 = Stream.iterate(1, i -> i + 1); // 1 2 3 4 5 6 ...
        Stream<Integer> s2 = Stream.iterate(1, i -> i + 2); // 1 3 5 7 9 11 ...
    }
}
