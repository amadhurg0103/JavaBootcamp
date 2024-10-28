package com.madhur;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
       fun(1,25,45,78,89,46,45,48);
       fun();
       multiple(45,78,"Madhur","Girish");
    }
    static void multiple(int a,int b,String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
