package com.madhur;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int Sum=num1+num2;
        System.out.println("Sum=" + Sum);
    }
}
