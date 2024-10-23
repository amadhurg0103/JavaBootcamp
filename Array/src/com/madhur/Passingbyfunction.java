package com.madhur;

import java.util.Arrays;

public class Passingbyfunction {
    public static void main(String[] args) {
        int [] arr={1,45,75,89,56};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[1]=78;
    }
}
