package com.codegym.task.task01.task0130;

/*
Our first converter!

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
     System.out.println(convertCelsiusToFahrenheit(41));

    }

    public static double convertCelsiusToFahrenheit(int celsius) {
       double tCelsius = celsius;
       double tFahrenheit = 9/5. * tCelsius+ 32;
       return tFahrenheit;
    }
}