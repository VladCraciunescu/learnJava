package example1;

import java.util.Random;
import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Random r = new Random();
        Supplier<Integer> s1 = ()-> r.nextInt(1000);
        int x = s1.get();
        System.out.println(x);

    }
}
