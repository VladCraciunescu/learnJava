import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {
        public static void main(String[] args) {
            Comparator<Integer> c = Collections.reverseOrder();
            List<Integer> l = List.of(1,3,5,4,6,7,8,9,1);
            l.stream()
                    .distinct()
                    .sorted(c)
                    .forEach(System.out::println);
        }
    }

