package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> input = new ArrayList<>();

        input.add("мама");
        input.add("мыла");
        input.add("раму");
        for (int i = 0; i < 6; i+=2) {
            input.add(i+1,"именно");
        }
        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }

    }
}
