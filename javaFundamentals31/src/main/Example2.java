package main;

public class Example2 {
    public static void main(String[] args) {
        Foo<String>f1 = new Foo<String>();
        f1.x = "hello";
        Foo<Integer>f2 = new Foo<Integer>();
        f2.x = 10;
        int x = f2.x;
    }
}
