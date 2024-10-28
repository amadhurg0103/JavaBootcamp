package com.madhur;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int [][] arr=new int[2][2];
//        int [][] arr2d={
//                {1,2,3},
//                {4,5},
//                {7,8,9,5}
//        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }System.out.println();
//        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for (int [] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
