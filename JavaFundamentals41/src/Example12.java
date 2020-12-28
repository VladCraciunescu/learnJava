import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example12 {
    public static void main(String[] args) {
        Set<Integer> res =
                Stream.of(1,2,3,4,5,1,2)
                        .map(n -> 2*n)
                        .collect(Collectors.toSet());

        System.out.println(res);
    }
}
