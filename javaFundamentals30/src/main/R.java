package main;

public class R implements AutoCloseable {
    String name ;

    public R(String name) {
        this.name = name;
    }

    @Override
    public void close() {
        System.out.println(":) "+ name);
    }
}
