package example2;

public class Example2 {
    public static void main(String[] args) {
        B<?> b1 = new B<>(10.5);
        System.out.println(b1.a.getClass());

        B<? extends Number> b2 = new B<>(10);
        B<? super Number> b3 = new B<>(10);

    }
}
