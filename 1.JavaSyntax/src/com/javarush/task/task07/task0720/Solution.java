package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> input = new ArrayList<>();

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            input.add(reader.readLine());
        }

        for (int j = 0; j < M; j++) {
            input.add(input.remove(0));


        }

        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }
        //напишите тут ваш код
    }
}
