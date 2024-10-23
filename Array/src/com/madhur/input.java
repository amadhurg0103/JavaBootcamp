package com.madhur;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr=new int[5];
//        input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
//        print using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        for-each loop
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
