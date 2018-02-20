package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> set = new HashSet<>(cats);

        set.addAll(dogs);

        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        cats.forEach(pets::remove);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        pets.forEach(System.out::println);

    }

    public static class Cat{
        Cat(){
        }
    }
    public static class Dog{
        Dog(){
        }
    }
    //напишите тут ваш код
}
