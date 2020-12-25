import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> output = new ArrayList<>();
        list.stream()
                .filter(n -> n % 2 == 0)
                .peek(n -> output.add(n))
                .forEach(System.out::println);
        System.out.println(output);
    }
}
