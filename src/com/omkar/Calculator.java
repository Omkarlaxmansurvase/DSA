package com.omkar;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while (true){
            System.out.println("enter a operator");
            char op =  in.next().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("enter two numbers");
                int a = in.nextInt();
                int b = in.nextInt();
                if (op=='+'){
                    ans = a + b;
                }
                else if (op=='-'){
                    ans = a - b;
                }
                else if (op=='*'){
                    ans = a * b;
                }
                else if (op=='/'){
                    if(b!=0){
                        ans = a/b;
                    }
                }
            }
            else if(op=='X' || op=='x'){
                System.out.println("exited program");
                break;
            }
            else{
                System.out.println("invalid operator");
            }
            System.out.println(ans);

        }


    }
}
