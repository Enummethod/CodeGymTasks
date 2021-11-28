package com.codegym.task.task02.task0202;

/* 
Where does a Person come from?

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Mustafa";
        person.age = 25;
        person.weight = 83;
        person.money = 5000;
    }

    public static class Person {
        String name;
        int age;
        int weight;
        int money;
    }
}
