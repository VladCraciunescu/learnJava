package main;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
//     R r = null;
//        try{
//            r = new R();
//        }catch (Exception e){
//
//        }finally {
//            if (r== null) r.close();
//        }
        try(R r = new R("12")){

        }catch (Exception e){

        }

    }
}