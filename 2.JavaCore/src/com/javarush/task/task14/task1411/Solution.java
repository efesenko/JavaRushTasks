package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = reader.readLine();
        List <String> list = new LinkedList<>();
        while (key.equals("user")||key.equals("loser")||key.equals("coder")||key.equals("proger")){
            if (key.equals("user")) list.add(key);
            if (key.equals("loser")) list.add(key);
            if (key.equals("coder")) list.add(key);
            if (key.equals("proger")) list.add(key);
        }

        {
            for (String s : list) {

            }

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof User) person.live();
        else if (person instanceof Loser) person.doNothing();
        else if (person instanceof Coder) person.coding();
        else if (person instanceof Proger) person.enjoy();
    }
}
