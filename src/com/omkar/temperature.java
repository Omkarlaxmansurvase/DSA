package com.omkar;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.println("enter the temperature");
        Scanner input = new Scanner(System.in);
        float tempc= input.nextFloat();

        float tempf= tempc*1.8f + 32;
        System.out.println("your temperature in farenhite " +tempf);

    }
}
