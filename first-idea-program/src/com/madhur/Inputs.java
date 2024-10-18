package com.madhur;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter some number:");
        int rollno=input.nextInt();
        System.out.println("Your rollno is " + rollno );
        String name=input.next();
        System.out.println(name);
        String name1= input.nextLine();
        System.out.println(name1);
        float marks= input.nextFloat();
        System.out.println(marks);

    }
}
