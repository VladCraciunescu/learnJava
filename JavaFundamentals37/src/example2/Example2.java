package example2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new LinkedHashMap<>();
        m1.put(10, "ABC");
        m1.put(20, "QWE");
        m1.put(10, "WWW");
        m1.put(30, "WWW");
        System.out.println(m1);
        Map<Integer, String> m2 = new TreeMap<>(
                Collections.reverseOrder());
        m2.put(10, "ABC");
        m2.put(20, "QWE");
        m2.put(10, "WWW");
        m2.put(30, "WWW");
        System.out.println(m2);


    }
}
