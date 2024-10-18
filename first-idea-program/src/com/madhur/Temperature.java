package com.madhur;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Temperature in C");
        float TemC= in.nextFloat();
        Double TemF=(TemC*1.8)+32;
        System.out.println(TemF);

    }

}
