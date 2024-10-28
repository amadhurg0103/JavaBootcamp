package com.madhur;

public class Maxin2Darray {
    public static void main(String[] args) {
        int [][] arr={
                {12,45,78,49},
                {15,14},
                {16,23,89,46},
                {34,104,44}
        };
        int MAX=max(arr);
        System.out.println(MAX);
    }
    static int max(int[][] arr){
        int max=arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
//    static int max(int[][] arr){
//        int max=arr[0][0];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col]>max){
//                    max=arr[row][col];
//                }
//            }
//        }return max;
//    }
}
