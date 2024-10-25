package com.madhur;

public class SearchinRange {
    public static void main(String[] args) {
        int[]arr={1,5,48,46,23};
        int target=46;
        int start=1;
        int end=3;
        int Index=LinearSearch(arr,target,start,end);
        System.out.println(Index);
    }

     static int LinearSearch(int[] arr, int target,int start,int end) {
         if (arr.length==0){
             return -1;
         }
         for (int i = start; i <=end ; i++) {
             if (arr[i]==target){
                 return i;
             }
         }
         return -1;//this will only work if not found

    }
}
