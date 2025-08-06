package com.omkar;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("enter the numbers you want to sum");
        System.out.println("enter 1st num");
        Scanner input1 = new Scanner(System.in);
        int num1=input1.nextInt();
        System.out.println("enter 2nd num");
        Scanner input2 = new Scanner(System.in);
        int num2=input2.nextInt();
        int ans =num1+num2;
        System.out.println("the ans is "+ans);

    }
}
