package com.omkar;

public class Methods {
    public static void main(String[] args) {
        String msgs=Greet(" omkar");
        System.out.println(msgs);

    }
    static String Greet(String msg){
        return "hello" + msg;
    }

}





//syntax:
// return_type name(){
//  body
//    return statement;
//}
