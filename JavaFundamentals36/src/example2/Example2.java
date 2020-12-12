package example2;

import java.util.Comparator;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        Comparator <Dog> c1 = (d1,d2)-> d1.getAge() - d2.getAge();
        Comparator <Dog> c2 = (d1,d2)->d1.getName().compareTo(d2.getName());
        var set = new TreeSet<Dog>(c2);

        set.add(new Dog(3, "A"));
        set.add(new Dog(2, "D"));
        set.add(new Dog(1, "C"));
        set.add(new Dog(6, "F"));

        set.forEach(System.out::println);
    }
}
