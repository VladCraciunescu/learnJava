import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list.stream()
                .filter(n -> n % 2 == 0)
                .skip(4)
                .forEach(System.out::println);
    }
}
