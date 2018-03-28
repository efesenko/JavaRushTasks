package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

                String[] arrStr = new String[10];
                int[] arrInt = new int[10];

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                for (int i = 0; i < arrStr.length; i++) {
                    arrStr[i] = reader.readLine();
                }

                for (int i = 0 ; i < arrStr.length; i++) {
                    arrInt[i] = arrStr[i].length();
                    System.out.println(arrInt[i]);
                }

            }
        }
