package example1;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>();
        var d2 = new ArrayDeque<>();
        ArrayDeque<Integer> d3 = new ArrayDeque<>();
        d1.push(1);
        d1.push(2);
        d1.push(3);
        System.out.println(d1);
        d1.pop();
        System.out.println(d1);
        d1.removeFirst();
        System.out.println(d1);
        d1.push(2);
        d1.push(3);
        System.out.println(d1);
        d1.removeLast();
        System.out.println(d1);
        d1.pop();
        d1.pop();
        d1.offer(1);
        d1.offer(2);
        d1.offer(3);
        System.out.println(d1);
        d1.pop();
        System.out.println(d1);


    }
}
