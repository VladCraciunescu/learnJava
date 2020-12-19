package example1;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8,9);
        l1.stream()
          .filter(x->x%2==0)
          .forEach(System.out::println);
    }
}

