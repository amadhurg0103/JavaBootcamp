package com.madhur;

public class Shadowing {
    static int x=90;//this will be shadowed by x at line 7
    public static void main(String[] args) {
        System.out.println(x);
//        int x=40;
       int x;
       // System.out.println(x); scope will begin when value is initialised.
       x=40;

        System.out.println(x);
        fun();
    }

     static void fun() {
         System.out.println(x);
    }
}
