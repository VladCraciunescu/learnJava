package main;

public class Example5 {
    public static void main(String[] args) {
        R r1 = new R("R1");
        R r2 = new R("R2");

        try(r1;r2){

        }
    }
}
