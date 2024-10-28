package com.madhur;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(45);
        fun(45,78);
        fun("Madhur");
        sum(45,78);
        sum(45,78,98);
        varar(7,78,8,9);
        varar("Madhur","Kunal");
    }
    static int sum(int a,int b){
        return a+b;
    }
    static  int sum (int a,int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a + b);
    }
    static void fun(String num){
        System.out.println(num);
    }
    static void varar(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void varar(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
