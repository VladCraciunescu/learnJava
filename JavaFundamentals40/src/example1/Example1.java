package example1;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> l1 = List.of("abc","qwerty","asdfgh");
        var x =l1.stream()
          .map(s -> s.length())
          .reduce(0,(a,b) ->a+b);
        System.out.println(x);
    }
}
