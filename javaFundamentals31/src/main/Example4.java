package main;

public class Example4 {
    public static void main(String[] args) {
        Foo<Integer> f1 = new Foo<Integer>();
        f1.x = 10;
        f1.x = 30;

        Foo<? extends Number> f2 = new Foo<Integer>();


        Foo<? super Number> f3 = new Foo<Number>();
        f3.x = 10;
    }
}
