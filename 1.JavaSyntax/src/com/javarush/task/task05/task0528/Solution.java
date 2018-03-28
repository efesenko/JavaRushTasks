package com.javarush.task.task05.task0528;
import java.text.SimpleDateFormat;
import java.util.Date;
/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM YYYY");
        Date date = new Date();

        // Вывод текущей даты и времени с использованием toString()
        System.out.println(dateFormat.format(date));
    }
}
