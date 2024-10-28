package com.madhur;


import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(45);
//        list.add(78);
//        list.add(94);
//        list.add(102);
//        list.add(61);
//        System.out.println(list);
//        System.out.println(list.contains(45));
//        System.out.println(list.set(0,68));
//        System.out.println(list.remove(4));
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here list[index] will not work here
        }
    }
}
