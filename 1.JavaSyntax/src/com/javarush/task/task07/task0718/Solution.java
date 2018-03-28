package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> input = new ArrayList<>();

        int goodOne = 0;

        for (int i = 0; i < 10; i++) {
            input.add(reader.readLine());
        }
int length = -1;
        for (int i = 1; i < input.size(); i++) {

            if (input.get(i).length() < length){
                System.out.println(i);
            }

            length = input.get(i).length();

        }


    }
}

