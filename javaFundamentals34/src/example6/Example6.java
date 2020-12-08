package example6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(34);
        list.add(1);
        list.add(20);
        list.add(20);

        Iterator<Integer> i = list.iterator();
        while(i.hasNext()){
            Integer x = i.next();
            System.out.println(x);
        }

    }
}
