package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int heigth;
        private double weight;
        private String surName;
        private int pr;



        public Human(String name){//1
            this.name = name;
        }
        public Human(String surName, String name){//2
            this.surName = surName;
            this.name = name;
        }

        public Human(String name, int age){//3
            this.name = name;
            this.age = age;
        }

        public Human(int age){//4
            this.age = age;
        }

        public Human(int age, String name){//5
            this.name = name;
            this.age = age;
        }
        public Human(int age, int heigth){//6
            this.heigth = heigth;
            this.age = age;
        }
        public Human(int age, double weight){//7
            this.weight = weight;
            this.age = age;
        }
        public Human(int age, int heigth, double weight){//8
            this.heigth = heigth;
            this.age = age;
            this.weight = weight;
        }
        public Human(String name, String surName, int age, int heigth, double weight){//9
            this.heigth = heigth;
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.surName = surName;
        }
        public Human(String name, String surName, int age, int heigth, double weight, int pr){//10
            this.heigth = heigth;
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.surName = surName;
            this.pr = pr;
        }


    }

}
