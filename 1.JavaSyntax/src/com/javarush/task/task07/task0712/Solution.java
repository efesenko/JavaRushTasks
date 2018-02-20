package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        String shortest = strings.get(0);
        int shortestID = 0;
        String longest = strings.get(0);
        int longestId = 0;

        for (int i = 0; i < 10; i++) {
            if (shortest.length() > strings.get(i).length()) {
                shortest = strings.get(i);
                shortestID = i;
            }
            if (longest.length() < strings.get(i).length()) {
                longest = strings.get(i);
                longestId = i;
            }
        }
        if (shortestID < longestId) System.out.println(strings.get(shortestID));
        else System.out.println(strings.get(longestId));


    }
}
