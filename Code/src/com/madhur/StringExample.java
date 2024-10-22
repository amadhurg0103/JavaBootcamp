package com.madhur;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);
        Scanner in=new Scanner(System.in);
        System.out.println(

        );
        String personalised=mygreet("Madhur");
        System.out.println(personalised);

    }

     static String mygreet(String name) {
        String message="Hello " + name;
        return message;
    }

    static String greet(){
        String greeting="How are you";
        return greeting;
    }
}
