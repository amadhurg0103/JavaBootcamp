package com.madhur;

public class ReturntheIndex {
    public static void main(String[] args) {
         int[]arr={1,5,48,46,23};
         int target=78;
         int Index=LinearSearch(arr,target);
        System.out.println(Index);
    }
    //a fxn if element find then return the index
    //not found return -1
    static int LinearSearch(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;//this will only work if not found
    }
}