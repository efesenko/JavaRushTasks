package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();

        String ageTemp= bufferedReader.readLine();
        int age = Integer.parseInt(ageTemp);

        if (age <18) System.out.println("Подрасти еще");

    }
}

