package com.omkar;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        System.out.println("enter you string");
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");

        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("upper case");
        }
    }
}
