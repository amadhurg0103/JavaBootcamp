package com.madhur;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
//    int a=10;
//    int b=20;
//    int c=30;
//    if(a>=b && a>=c){
//        System.out.println(a);
//    }else if(b>=c){
//        System.out.println(b);
//    }else{
//        System.out.println(c);
//    }
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
//
//        int max=a;
//        if(b>max){
//            max=b;
//        }if (c>max){
//            max=c;
//        }
//        System.out.println(max);
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
}
}