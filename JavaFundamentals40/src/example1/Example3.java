package example1;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> l1 = List.of("asdf","qwergh","zxcvb");
        int i = l1.stream()
          .mapToInt(s->s.length())
          .mapToObj(s->s)
          .mapToInt(s->s)
          .sum();
        System.out.println(i);
    }
}
