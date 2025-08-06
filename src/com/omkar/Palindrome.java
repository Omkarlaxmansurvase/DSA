package com.omkar;

import java.util.Scanner;

public class Palindrome{
    public static boolean isPalindrome(int x){
        Scanner sc= new Scanner(System.in);
        int temp,ans=0;
        temp=x;
        x=sc.nextInt();
        System.out.println("enter the number");
        while(x>0){
            int rem=x%10;
            x=x/10;
            ans=ans*10+rem;
        }
        if (ans==temp){
            return true;
        }
        else
            return false;


    }
    public static void main(String[] args) {

    }
}

