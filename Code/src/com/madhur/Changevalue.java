package com.madhur;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int [] arr={1,55,89,40,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] num) {
         num[0]=90;
// if you make change to the obj via reference variable then original obj will get changed
    }
}
