package example4;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(34);
            list.add(1);
            list.add(20);
            list.add(20);
            for(int i = 1;i<list.size();i++){
                int x = list.get(i);
                System.out.println(x);
            }
        }
    }

