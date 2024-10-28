package com.madhur;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int [][] arr={
                {12,45,78,49},
                {15,14},
                {16,23,89,46},
                {34,79,44}
        };
        int target=23;
//        System.out.println(Search2(arr,target));
        int [] ans=Search2(arr,target); //format of return will be an array {row,col}
        System.out.println(Arrays.toString(ans));
    }

     static int[] Search2(int[][] arr, int target) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 if (arr[i][j] == target) {
                     return new int[]{i, j};
                 }
             }
         }return new int[]{-1,-1};
     }

//     static boolean Search(int[][] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if(arr[i][j]==target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//    }
}
