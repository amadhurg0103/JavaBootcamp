package com.madhur;

public class Shufflearray {
    public static void main(String[] args) {

    }
    static int[] shuffle(int[] nums, int n) {
       int [] arr=new int[nums.length];
       arr[0]=nums[0];
       arr[nums.length-1]=nums[nums.length-1];
        for (int i = 1; i < nums.length-2 ; i++) {
            if (i%2==0){
                arr[i]=nums[n-1];
            }else {
                arr[i]=nums[n];
            }
        }
        return arr;
    }
}
