package com.madhur;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=9;
    }
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int [] ind= new int[2];
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]+nums[i+1]==target){
                    ind[0]=i;
                    ind[1]=i+1;
                }
            }
            return ind;
        }
    }
}
