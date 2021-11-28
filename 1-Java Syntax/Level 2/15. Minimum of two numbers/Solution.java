package com.codegym.task.task02.task0214;

/* 
Minimum of two numbers

*/

// Mustafa YAŞAR

public class Solution {
    public static int min(int a, int b) {
        int min = a < b ? a : b;
        return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
