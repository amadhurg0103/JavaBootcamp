package com.madhur;

public class Concatenation {
    public static void main(String[] args) {
      int[]nums={1,2,1};
      int [] ans=getConcatenation(nums);
        System.out.println(ans);
    }

    static int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[] ans = new int[n];
       for  (int i = 0; i <nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = nums.length; i < n; i++) {
            ans[i]=nums[i-nums.length];
        }
        return ans;
    }

}
