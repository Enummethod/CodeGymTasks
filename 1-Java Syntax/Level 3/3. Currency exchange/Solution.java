package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
    System.out.println(convertEurToUsd(85, 1.1325));
    System.out.println( convertEurToUsd(150, 1.1325));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
     double usd = eur * exchangeRate;
     return usd;
    }
}
