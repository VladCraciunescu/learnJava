package example7;

import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(34);
        list.add(1);
        list.add(20);
        list.add(20);


        list.forEach(System.out::println);
    }
}
