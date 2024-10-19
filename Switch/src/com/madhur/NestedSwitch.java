package com.madhur;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int Empid=in.nextInt();
        String Department=in.next();
        switch (Empid){
            case 1:
                System.out.println("Madhur Gupta");
                break;
            case 2:
                System.out.println("Ashish kumar");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (Department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Enter correct department");
                }
                break;
            default:
                System.out.println("Enter valid emp id");
        }
        switch (Empid) {
            case 1 -> System.out.println("Madhur Gupta");
            case 2 -> System.out.println("Ashish kumar");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (Department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("Enter correct department");
                }
            }
            default -> System.out.println("Enter valid emp id");
        }
    }
}
