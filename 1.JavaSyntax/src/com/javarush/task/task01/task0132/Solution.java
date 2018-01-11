package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int t = 0;
        char s1;
        String s = "" + number;

        for (int i = 0; i < s.length(); i++){
            s1 = s.charAt(i);
            t += (int)(s1 - '0');
        }
        return t;


    }
}