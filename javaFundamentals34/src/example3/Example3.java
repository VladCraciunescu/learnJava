package example3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(34);
        list.add(1);
        list.add(20);
        list.add(20);
        Integer x1 = list.get(2);
        System.out.println(x1);
        Integer x2 = list.get(6);
        System.out.println(x2);
    }
}
