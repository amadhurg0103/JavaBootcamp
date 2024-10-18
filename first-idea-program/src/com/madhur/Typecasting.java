package com.madhur;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float num= input.nextFloat();
        System.out.println(num);
//      Typecasting
        int num1=(int)(65.5646f);
        System.out.println(num1);
        // Automatic type promotion in expression
        int a1=257;
        byte b2=(byte)(a1);
        System.out.println(b2);
        byte a=40;
        byte b=50;
        byte c=100;
        int d=a*b/c;
        System.out.println(d);
        int number='A';
        System.out.println(number);
    }
}
