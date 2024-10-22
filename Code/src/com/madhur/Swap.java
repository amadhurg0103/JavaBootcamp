package com.madhur;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //swap two numbers code
//        int temp=a;
//        a=b;
//        b=temp;
        swap(a,b);
        System.out.println(a+ " " +b);
        String name="Madhur Gupta";
        changeName(name);
        System.out.println(name);
        }

     static void changeName(String name) {
         name="Hardik";
    }

    static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
//        this will only change the value in the scope of fxn not outside
    }

}
