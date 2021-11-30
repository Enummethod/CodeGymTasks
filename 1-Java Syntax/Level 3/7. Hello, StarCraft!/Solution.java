package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

// Mustafa YAŞAR

public class Solution {
    public static void main(String[] args) {
        Zerg zergOne = new Zerg();
        Zerg zergTwo = new Zerg();
        Zerg zergThree = new Zerg();
        Zerg zergFour = new Zerg();
        Zerg zergFive = new Zerg();
        zergOne.name = "Zet";
        zergTwo.name = "Zen";
        zergThree.name = "Zem";
        zergFour.name = "Zer";
        zergFive.name = "Zel";
        Protoss protossOne = new Protoss();
        Protoss protossTwo = new Protoss();
        Protoss protossOneThre = new Protoss();
        protossOne.name = "Pet";
        protossTwo.name = "Pen";
        protossOneThre.name = "Pem";
        Terran terranOne =  new Terran();
        Terran terranTwo =  new Terran();
        Terran terranThree =  new Terran();
        Terran terranFour =  new Terran();
        terranOne.name = "Tet";
        terranTwo.name = "Ten";
        terranThree.name = "Tem";
        terranFour.name = "Ter";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
