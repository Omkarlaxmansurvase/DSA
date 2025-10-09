
// https://leetcode.com/problems/largest-rectangle-in-histogram/

package com.dsa;

import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {

    }
    public int largestRectangleArea(int[] h) {
        // initialization and memory alloacation
        int n=h.length;
        Stack<Integer> st = new Stack<>();
        int [] nse = new int[n]; // next smallest element
        int [] pse = new int[n]; // prev smallest element

        // nse
        st.push(n-1);
        nse[n-1]=n;
        for(int i =n-2;i>=0;i--){
            while(st.size()>0 && h[st.peek()]>=h[i]){
                st.pop();
            }
            if(st.size()==0){
                nse[i]=n;
            }
            else nse[i]=st.peek();
            st.push(i);
        }
        //empty stack st
        while(st.size()>0) st.pop();
        //pse[]
        st.push(0);
        pse[0]=-1;
        for(int i=1;i<=n-1;i++){
            while(st.size()>0 && h[st.peek()]>=h[i]){
                st.pop();
            }
            if(st.size()==0){
                pse[i]=-1;
            }
            else pse[i]=st.peek();
            st.push(i);
        }
        // now max area of rectangle
        int max=-1;

        for(int i=0;i<n;i++){
            int area = h[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
}
