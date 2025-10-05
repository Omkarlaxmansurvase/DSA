package com.dsa;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        reverse(st);

        // Printing reversed stack
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    static void reverse(Stack<Integer> st) {
        if (st.size() == 1) {
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(top, st);
    }

    static void pushAtBottom(int top, Stack<Integer> st) {
        if (st.isEmpty()) {
            st.push(top);
            return;
        }
        int temp = st.pop();
        pushAtBottom(top, st);
        st.push(temp);
    }
}
