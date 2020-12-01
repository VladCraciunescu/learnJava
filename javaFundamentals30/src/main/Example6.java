package main;

public class Example6 {
    public static void main(String[] args) {
        R r1 =  new R("1");
        m(r1);
    }
    public static void m(R r){
        try (r){
        }
    }
}
