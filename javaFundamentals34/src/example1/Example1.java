package example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new LinkedList<>();
        List<String> list1 = Arrays.asList("ABC", "QWE", "AAA");
        List<String> list2 = List.of("ABC", "QWE", "AAA");
    }
}
