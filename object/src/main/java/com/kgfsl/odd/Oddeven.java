package com.kgfsl.odd;

import java.util.Scanner;

class Oddeven{
    //private int n;
    public static int getnum(){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        return n;
    }
  public static void main(String[] args) {
        System.out.println((getnum()%2)==0?"even":"odd");
    }
}