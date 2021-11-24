package com.codegym.task.task01.task0123;

/*
We don't need any extra lines

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = b + 38;  //c=53
       // int d = a + 12;    //d=22
       // double e = 12.3;
        String s = "s" + a;     //s10
        String s1 = a + "b";     //10b
       // String s2 = "a";           //a
        String s3 = s1 + "a";       //10ba
        String s4 = s3 + "b";        //10bab
        System.out.println(c + s4 + s);//5310babs10
    }
}