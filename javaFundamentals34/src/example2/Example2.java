package example2;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(12);
        System.out.println(list.size());
        list.add(20);
        list.add(99);
        System.out.println(list.size());
        System.out.println(list);
    }
}
