package com.dsa;

import java.util.Stack;

public class InifixToPrefix {
    public static void main(String[] args) {
        String Infix="9-(5+3)*4/6";
        System.out.println(Infix);
        Stack<String> val =new Stack<>();
        Stack<Character> op =new Stack<>();

        for(int i=0;i<Infix.length();i++){
            char ch = Infix.charAt(i);
            int ascii= (int)ch;
            //'0'->48 and '9'-> 57
            if(ascii>=48 && ascii<=57){
                String S=""+ch;
                val.push(S);//this puts the actual no in stack
            }
            else if  (op.size()==0 || ch=='(' || op.peek()=='(' ) op.push(ch);
            else if (ch==')'){
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char O=op.pop();
                    String T=O+v1+v2; // ch+str+str <op><v1><v2>
                    val.push(T);
                }
                op.pop(); //removed opening bracket here
            }
            else{
                if(ch=='+' || ch == '-'){
                    // do work
                    String v2=val.pop();
                    String v1=val.pop();
                    char O=op.pop();
                    String T=O+v1+v2; // ch+str+str <op><v1><v2>
                    val.push(T);
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char O=op.pop();
                        String T=O+v1+v2; // ch+str+str <op><v1><v2>
                        val.push(T);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char O=op.pop();
            String T=O+v1+v2; // ch+str+str <op><v1><v2>
            val.push(T);
        }
        String prefix =val.pop();
        System.out.println(prefix);
    }
}
