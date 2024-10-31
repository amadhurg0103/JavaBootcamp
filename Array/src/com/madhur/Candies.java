package com.madhur;

import java.util.ArrayList;

public class Candies {
    public static void main(String[] args) {
        int [] candies={2,3,5,1,3};
        int extraCandies=3;
        ArrayList<Boolean> arr = kidsWithCandies(candies, extraCandies);
        System.out.println(arr);

    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
         for (int i = 0; i < candies.length; i++) {
             candies[i]+=extraCandies;
             int max=candies[i];
             for (int j = 0; j < candies.length; j++) {
                 if (max<=candies[j]){
                     max=candies[j];
                 }
             }if(max==candies[i]){
                 arr.add(true);
             }else{
                 arr.add(false);
             }
             candies[i]-=extraCandies;
         }
        return arr;

    }
}
