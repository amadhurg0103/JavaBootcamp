package com.madhur;

public class goodPair {
    public static void main(String[] args) {
         int [] num={1,2,3,1,1,3};
         int goodpair=numIdenticalPairs(num);
        System.out.println(goodpair);
    }

     static int numIdenticalPairs(int[] num) {
        int n=0;
         for (int i = 0; i < num.length; i++) {
             for (int j = 0; j > num.length; j++) {
                 if (i!=j && i<j){
                     if (num[i]==num[j]){
                         n++;
                     }
                 }
             }
         }return n;
    }
}
