package com.codegym.task.task03.task0308;

/* 
Product of 10 numbers

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
       int oneToTen = 1;
       for (int i = 2; i <= 10; i++) {
           oneToTen *= i;
        }

        System.out.println(oneToTen);
    }
}
