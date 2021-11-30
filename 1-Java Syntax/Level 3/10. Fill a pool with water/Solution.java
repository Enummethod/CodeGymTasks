package com.codegym.task.task01.task0134;

/* 
Fill a pool with water

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        long volume = a * b * c * 1000L;
        return volume;
    }
}