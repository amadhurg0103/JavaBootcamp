package com.madhur;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        switch (fruit){
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            default:
//                System.out.println("Invalid input");
       Scanner in=new Scanner(System.in);
//        String fruit= in.next();
//        switch (fruit) {
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Mango" -> System.out.println("King of fruits");
//            default -> System.out.println("Invalid input");
//        }
        int day=in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }
 }
}