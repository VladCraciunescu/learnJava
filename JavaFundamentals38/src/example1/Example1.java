package example1;

public class Example1 implements Eatable {
    public static void main(String[] args) {


        Eatable e2 = () -> System.out.println("nom");
    }

    @Override
    public void eat() {

    }
}
