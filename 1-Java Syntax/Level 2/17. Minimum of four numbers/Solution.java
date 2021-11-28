package com.codegym.task.task02.task0217;

/* 
Minimum of four numbers

*/

// Mustafa YAŞAR

public class Solution {
    public static int min(int a, int b, int c, int d) {
       int minone = min (a,b);
       int mintwo = min (c,d);
       int min = minone <= mintwo ? minone : mintwo;
       return min ;
    }

    public static int min(int a, int b) {
        int min = a <= b ? a : b ;
        return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
