package com.madhur;

public class Pangram {
    public static void main(String[] args) {

    }
    public boolean checkIfPangram(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)>='a' && sentence.charAt(i)<='z'){
                return true;
            }
        }
         return false;
    }
}
