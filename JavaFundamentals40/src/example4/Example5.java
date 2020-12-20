package example4;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> list = List.of("ab4n3kdk4", "2n3n2nnm", "mko","102a");
        String digits = "0123456789";
        var x =list.stream()
            .flatMap(s-> Arrays.stream(s.split("")))
            .filter(s->digits.contains(s))
            .count();
        System.out.println(x);
    }
}
