package example1;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Operators {
    public static void main(String[] args) {
        UnaryOperator<Integer> u1 = n -> n+1;
        int res = u1.apply(1);
        System.out.println(res);
        BinaryOperator<Integer> b1= (a,b) -> a+b;
        int res2= b1.apply(10,20);
        System.out.println(res2);
    }
}
