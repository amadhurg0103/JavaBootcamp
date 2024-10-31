package com.madhur;

public class buildArray {
    public static void main(String[] args) {
       int [] nums= {0,2,1,5,3,4};
       int [] arr=buildarray(nums);
        System.out.println(arr);
    }

    static int[] buildarray(int[] nums) {
        int []arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[nums[i]];
        }
        return arr;
    }

}
