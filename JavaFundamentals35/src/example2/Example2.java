package example2;

import java.util.*;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Set<Integer> s1 = Set.of(12 , 13 ,14);
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new LinkedHashSet<>();
        Set<Integer> s4 = new TreeSet<>();
        Set<Integer> set5 = Arrays.asList(10,20,30)
                .stream().collect(Collectors.toSet());



    }
}
