package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] > maximum)
                maximum = array[i];

            if(array[i] < minimum)
                minimum = array[i];
        }


        //напишите тут ваш код

        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}
