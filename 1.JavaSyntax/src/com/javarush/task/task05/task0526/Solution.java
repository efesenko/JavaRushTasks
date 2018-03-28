package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("loh", 23, "Hueviy");
        Man man2 = new Man("loh2", 13, "Hueviy111");
        System.out.println( man1.name + " " + man1.age + " " + man1.address+ ".");
        System.out.println( man2.name + " " + man2.age + " " + man2.address+ ".");

        Woman wm1 = new Woman("loshica", 23, "aZAZHueviy");
        Woman wm2 = new Woman("loshica", 13, "ZAZAHueviy");

        System.out.println( wm1.name + " " + wm1.age + " " + wm1.address+ ".");
        System.out.println( wm2.name + " " + wm2.age + " " + wm2.address+ ".");
    }
    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address){
            this.age = age;
            this.name = name;
            this.address = address;
        }


    }
    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address){
            this.age = age;
            this.name = name;
            this.address = address;
        }


    }
    //напишите тут ваш код
}
