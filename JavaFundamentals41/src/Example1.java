import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,3,5,4,6,7,8,9,1);
        l.stream()
         .distinct()
         .sorted()
         .forEach(System.out::println);
    }
}
