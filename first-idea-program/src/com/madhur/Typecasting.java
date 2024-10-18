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
        System.out.println(3*5.2);//double
        System.out.println(8*5.8f);//float
        byte b5=42;
        char c8='a';
        short s=1024;
        int i=5000;
        float f=5.67f;
        double d7=0.1234;
        double result=(f*b5)+(i/c8)-(d7*s);
        System.out.println((f*b5) + " " + (i/c8) + " " + (d7*s));
        System.out.println(result);
    }
}
