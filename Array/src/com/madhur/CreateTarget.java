package com.madhur;

import java.util.Arrays;

public class CreateTarget {
    public static void main(String[] args) {
       int [] nums={0,1,2,3,4};
       int [] index={0,1,2,2,1};
       int [] ans= createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }
     static public int[] createTargetArray(int[] nums, int[] index) {
        int [] target=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[index[i]]=nums[i];
        }
        return target;
    }
}
