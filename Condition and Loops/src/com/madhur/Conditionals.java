package com.madhur;

public class Conditionals {
    public static void main(String[] args) {

      int salary=25400;
//       if (salary>10000){
//           salary=salary+2000;
//       }
//       else{
//           salary=salary+1000;
//       }
        if(salary>20000){
            salary+=2000;
        }else if (salary>10000) {
            salary+=5000;
        }else{
            salary+=1000;
        }
        System.out.println(salary);
    }
}