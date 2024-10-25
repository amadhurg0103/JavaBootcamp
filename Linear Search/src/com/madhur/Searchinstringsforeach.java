package com.madhur;

import java.util.Arrays;

public class Searchinstringsforeach {
    public static void main(String[] args) {
        String str="Madhur";
        char target='h';
        System.out.println(Search2(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean Search2(String str, char target) {
        if (str.length()==0){
            return false;
        }
        for (char ch:str.toCharArray()) {
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}
