package com.madhur;

public class MinNum {
    public static void main(String[] args) {
        int [] arr={18,12,7,3,14,2};
        int min=Minimum(arr);
        System.out.println(min);
    }
//assume arr.length=!0;
     static int Minimum(int[] arr) {
        int min=arr[0];
         for (int i = 1; i < arr.length; i++) {
             if(min>arr[i]){
                 min=arr[i];
             }
         }
         return min;
    }
}
