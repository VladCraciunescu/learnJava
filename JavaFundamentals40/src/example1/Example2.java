package example1;

import java.sql.SQLOutput;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> l1 = List.of("asdf","qwergh","zxcvb");
        l1.stream()
          .map(s -> new StringBuilder(s).reverse().toString())
          .forEach(System.out::println);
    }
}
