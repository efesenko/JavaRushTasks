package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human old1 = new Human("vas", true, 55);
        Human old2 = new Human("vasasd", false, 40);
        Human old3 = new Human("vaasdas", true, 45);
        Human old4 = new Human("vaasds", false, 35);

        Human new1 = new Human("vaasds", true, 31, old3, old2);
        Human new2 = new Human("vaasdasdads", false, 13, old4, old1);
        Human new3 = new Human("vaaasdasdsds", true, 5, old4, old3);
        Human new4 = new Human("vaasasdads", false, 15, old2, old3);
        Human new5 = new Human("vaasaaads", true, 20, old1, old2);

        System.out.println(old1.toString());
        System.out.println(old2.toString());
        System.out.println(old3.toString());
        System.out.println(old4.toString());
        System.out.println(new1.toString());
        System.out.println(new2.toString());
        System.out.println(new3.toString());
        System.out.println(new4.toString());
        System.out.println(new5.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean pol;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.pol = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.pol = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.pol ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















