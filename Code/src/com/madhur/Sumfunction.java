package com.madhur;

import java.util.Scanner;

public class Sumfunction {
    public static void main(String[] args) {
//        sum();
//        int ans=sum2();
//        System.out.println(ans);
        int ans=sum3(50,60);
        System.out.println(ans);
    }
    static int sum3(int a,int b){
        int sum1=a+b;
        return sum1;
    }
    static int sum2(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=in.nextInt();
        System.out.println("Enter Second number");
        int num2= in.nextInt();
        int sum=num1+num2;
        return sum;
       // System.out.println("This will never execute");
    }
    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=in.nextInt();
        System.out.println("Enter Second number");
        int num2= in.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of given numbers:" + sum);
    }
}
