package com.dsa;

import java.util.Stack;

public class PushAtAnyIdx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        int idx=2;
        int ele=8;
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(ele);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
