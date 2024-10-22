package com.madhur;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
//        System.out.println(marks);//error
        {
            //int a=10 you can't initialised same variable inside block
            a=20;//but you can change the value
            int c=10;
            System.out.println(c);
            //values inside this block will remain in this block
        }
        int c=50;//can be intialized as it is inside the block
        //System.out.println(c); can't use outside the block
        for (int i = 0; i < 10; i++) {
           int num=10;
            System.out.println(i);
        }
        //System.out.println(i); can't be used outside the block

    }
    static void random(int marks){
        int num=45;
        System.out.println(num);
        System.out.println(marks);
    }
}
