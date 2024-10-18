package com.madhur;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        String n= in.next();
//        char a='7';
//        int count=0;
//        for (int i = 0; i < 10; i++) {
//            if( a==n.charAt(i)){
//                count++;
//            }
//        }
//        System.out.println(count);
        int n=45536;
        int count=0;
        while (n>0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
                n = n / 10;
        }
        System.out.println(count);
    }
}
