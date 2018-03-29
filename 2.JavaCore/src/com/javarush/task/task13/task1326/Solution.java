package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream stream = new FileInputStream(fileName);

        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        int symbol;
        int Array array = new Array();


        while (!(line = reader.readLine()).equals("exit")) {
            list.add(line);
        }
        list.add(line);

        for (String s : list) {
            writer.write(String.format("%s%n",s));
        }

        reader.close();
        writer.close();

    }
}
