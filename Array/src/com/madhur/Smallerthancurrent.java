package com.madhur;

import java.util.Arrays;

public class Smallerthancurrent {
    public static void main(String[] args) {
        int [] nums={8,1,2,2,3};
        int [] ans=smaller(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] smaller(int[] nums) {
        int [] Number=new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
             int count=0;
             for (int j = 1; j < nums.length; j++) {
                 if (nums[i]>nums[j]){
                     count++;
                     Number[i]=count;
                 }
             }
         }
         return Number;
    }

}

