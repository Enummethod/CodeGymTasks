package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum =0;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        return sum;
    }
}