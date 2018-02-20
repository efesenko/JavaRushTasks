package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код
    Dog(){
    }
    String name;
    int age;

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return this.age;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }


    public static void main(String[] args) {

    }
}
