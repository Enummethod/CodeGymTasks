package com.codegym.task.task01.task0129;

/*
Calculate the circumference of a circle

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
        printCircleCircumference(5);
    }

    public static void printCircleCircumference(int radius) {
        double pi=3.14;
        double c=2*pi*radius;
        System.out.println(c);
    }
}