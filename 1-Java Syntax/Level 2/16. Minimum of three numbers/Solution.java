package com.codegym.task.task02.task0216;

/* 
Minimum of three numbers

*/

//Mustafa YAŞAR

public class Solution {
    public static int min(int a, int b, int c) {
       int min = a <= b ? a : b ;
       min = c <= min ? c : min;
       return  min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}
