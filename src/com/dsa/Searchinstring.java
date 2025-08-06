package com.dsa;

public class Searchinstring {
    public static void main(String[] args) {
        String name = "omkar";
        char target='o';
        boolean ans= check(name,target);
        System.out.println(ans);
    }
    static boolean check(String str,char target){
        if (str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if (target==str.charAt(i) ){
                return true;
            }
        }
        return false;
    }
}
