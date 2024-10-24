package com.madhur;

public class ReturntheElement {
    public static void main(String[] args) {
        int[] arr={45,78,49,3,6};
        int target=49;
        int element=Linearsearch(arr,target);
        System.out.println(element);

    }
    static int Linearsearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return arr[i];
            }
        }
        return -1;
    }
}
