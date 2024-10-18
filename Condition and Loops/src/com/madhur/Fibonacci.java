package com.madhur;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 2; i <n; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
//        System.out.println(a);
//        System.out.println(b);
//        int c;
//        for (int i = 0; i <10 ; i++) {
//            c=a+b;
//            System.out.println(c);
//            a=b;
//            b=c;
//        }
    }
}