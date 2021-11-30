package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String money = reader.readLine();
        String years = reader.readLine();

        System.out.println(name + " will receive " + money + " in " + years + " years.");
    }
}
