package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr_20 = new int[20];
        int[] arr1_10 = new int[10];
        int[] arr2_10 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr_20.length; i++) {
            arr_20[i] = Integer.valueOf(reader.readLine());
        }


        for (int i = 0; i < arr_20.length; i++) {
            if (i < 10) {

                arr1_10[i] = arr_20[i];

            } else {
                arr2_10[i-10] = arr_20[i];
            }

        }
            for (int i = 0; i < arr2_10.length; i++) {
            System.out.println(arr2_10[i]);
        }
    }
}
