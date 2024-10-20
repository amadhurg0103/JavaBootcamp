package com.madhur;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Take 2 number as input and take their sum
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=in.nextInt();
        System.out.println("Enter Second number");
        int num2= in.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of given numbers:" + sum);


    }
}